package lazy;

import annotations.ThreadSafe;

/**
 * Created by qincasin on 2020/2/5.
 * 双重检查机制 单例模式
 */
@ThreadSafe
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton lazy = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new DoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存对象
                }
            }
        }
        return lazy;
    }


    public static void main(String[] args) {
        new Thread(()->{
            DoubleCheckSingleton instance = getInstance();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            DoubleCheckSingleton instance = getInstance();
            System.out.println(instance);
        }).start();

    }
}
