package lazy;

import annotations.ThreadSafe;

/**
 * Created by qincasin on 2020/2/6.
 */
//这种形式兼顾饿汉式单例模式的内存浪费问题和synchronized的性能问题
//完美规避了这两个缺点
@ThreadSafe
public class InnerClassSingleton {
    /**
     * 默认出现初始化内部内，如果没有使用则内部类是不加载的
     */

    //防止反射破坏单例
    private InnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例!");
        }

    }


    public static final InnerClassSingleton getInstance() {
        //在返回结果之前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder {
        private static final InnerClassSingleton LAZY = new InnerClassSingleton();
    }

    public static void main(String[] args) {


//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
//                .setNameFormat("demo-pool-%d").build();
//        ExecutorService singleThreadPool = new ThreadPoolExecutor(1, 1,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
//
//        singleThreadPool.execute(()-> System.out.println(Thread.currentThread().getName()));
//        singleThreadPool.shutdown();

        new Thread(() -> {
            InnerClassSingleton instance = getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            InnerClassSingleton instance = getInstance();
            System.out.println(instance);
        }).start();
    }

}
