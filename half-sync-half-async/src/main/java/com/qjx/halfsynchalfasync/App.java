package com.qjx.halfsynchalfasync;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by qincasin on 2020/6/16.
 */
public class App {
    public static void main(String[] args) {
        AsynchronousService service = new AsynchronousService(new LinkedBlockingDeque<>());
        service.execute(new ArithmeticSumTask(1000));
        service.execute(new ArithmeticSumTask(2000));
        service.execute(new ArithmeticSumTask(500));
        service.execute(new ArithmeticSumTask(1));

        service.close();
    }

    static class ArithmeticSumTask implements AsyncTask<Long> {
        private long numberOfElements;

        public ArithmeticSumTask(long numberOfElements) {
            this.numberOfElements = numberOfElements;
        }

        @Override
        public void onPreCall() {
            if (numberOfElements < 0) {
                throw new IllegalArgumentException("n is less than 0");
            }
        }

        @Override
        public void onPostCall(Long result) {
            System.out.println(result.toString());
        }

        @Override
        public void onError(Throwable throwable) {
            throw new IllegalStateException("should not occur");
        }

        @Override
        public Long call() throws Exception {
            return ap(numberOfElements);
        }

    }
    private static Long ap(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();

            System.out.println("eeee:" + e);
        }
        return i * (i + 1) / 2;
    }
}
