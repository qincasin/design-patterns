package lazy;

import annotations.NotThreadSafe;

/**
 * Created by qincasin on 2020/2/5.
 */
@NotThreadSafe
public class SimpleSingleton {
    private SimpleSingleton() {
    }

    //静态块，公共内存区域
    private static SimpleSingleton lazy = null;

    public static SimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new SimpleSingleton();
        }
        return lazy;
    }

    public static void main(String[] args) {
        new Thread(() -> {
            SimpleSingleton instance = SimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();
        new Thread(() -> {
            SimpleSingleton instance = SimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }).start();
        System.out.println("end");
    }

}
