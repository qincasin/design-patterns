package cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by qincasin on 2021/3/9.
 * 使用cas 方式实现单利模式
 * 使用cas 的方式就是不需要使用传统的加锁来保证线程安全，而是靠cas的忙等算法保证线程安全，依赖于底层的硬件实现来保证线程安全
 * 相对于其他锁的实现没有了线程的切换和阻塞，也没有了额外的开销，并且支持更大的并发
 * cas 缺点就是 cpu忙等，如果一直没有取到就一直死循环
 */
public class AtomicSingleton {
    private static final AtomicReference<AtomicSingleton> INSTANCE = new AtomicReference<>();
    private static  AtomicSingleton instance;

    private AtomicSingleton() {
    }

    public static final AtomicSingleton getInstance(){
        for (;;){
            AtomicSingleton singleton = INSTANCE.get();
            if(singleton!=null){
                return singleton;
            }
            INSTANCE.compareAndSet(null,new AtomicSingleton());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(AtomicSingleton.getInstance());
        System.out.println(AtomicSingleton.getInstance());
    }
}
