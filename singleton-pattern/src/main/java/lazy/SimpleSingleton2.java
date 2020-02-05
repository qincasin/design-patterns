package lazy;

import annotations.ThreadSafe;

/**
 * Created by qincasin on 2020/2/5.
 */
@ThreadSafe
public class SimpleSingleton2 {
    private SimpleSingleton2() {
    }

    //静态块，公共内存区域
    private static SimpleSingleton2 lazy = null;

    public synchronized static SimpleSingleton2 getInstance() {
        if (lazy == null) {
            lazy = new SimpleSingleton2();
        }
        return lazy;
    }

    public static void main(String[] args) {
        new Thread(() -> {
            SimpleSingleton2 instance = SimpleSingleton2.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();
        new Thread(() -> {
            SimpleSingleton2 instance = SimpleSingleton2.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();
        System.out.println("end");
    }

}
