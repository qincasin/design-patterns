package hungry;

/**
 * 饿汉式单利模式
 * <p>
 * Created by qincasin on 2020/2/5.
 * 经典单例模式
 */
public class HungrySingleton {
    //先静态、后动态
    //先属性、后方法
    //先上后下
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public static void main(String[] args) {
        System.out.println(1%8);
    }
}
