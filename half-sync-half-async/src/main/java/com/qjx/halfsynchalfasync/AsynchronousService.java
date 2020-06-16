package com.qjx.halfsynchalfasync;

import lombok.SneakyThrows;

import java.util.concurrent.*;

/**
 * Created by qincasin on 2020/6/16.
 */
public class AsynchronousService {

    private ExecutorService executorService;

    public AsynchronousService(BlockingQueue<Runnable> workQueue) {
        executorService = new ThreadPoolExecutor(10,10,10, TimeUnit.SECONDS,workQueue);
    }

    public <T> void execute(final AsyncTask<T> task){

        try {
            task.onPreCall();
        } catch (Exception e) {
            e.printStackTrace();
            task.onError(e);
            return;
        }

        executorService.submit(new FutureTask<>(task){
            @Override
            protected void done() {
                super.done();
                try {
                    task.onPostCall(get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    // should not occur
                } catch (ExecutionException e) {
                    e.printStackTrace();
                    task.onError(e);
                }
            }
        });
    }

    public void close(){
        executorService.shutdown();
        try {
            executorService.awaitTermination(10,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error waiting for executor service shutdown!");
        }
    }
}
