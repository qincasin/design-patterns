package hungry;

/**
 * Created by qincasin on 2020/2/5.
 * 饿汉式静态代码块单利模式
 */
public class HungrySingleton2 {
    private HungrySingleton2() {
    }

    private static final HungrySingleton2 HUNGRY_SINGLETON_2;

    static {
        HUNGRY_SINGLETON_2 = new HungrySingleton2();
    }

    public static HungrySingleton2 getInstance() {
        return HUNGRY_SINGLETON_2;
    }
}
