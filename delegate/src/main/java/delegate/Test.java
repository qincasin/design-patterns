package delegate;

/**
 * Created by qincasin on 2020/9/22.
 */
public class Test {
    //代理注重过程，委派注重结果
    //策略模式注重可扩展性(外部扩展性)，委派注重内部的灵活性和可复制性
    //委派核心是分发、调度、委派，委派是静态代理和策略模式的一种组合
    public static void main(String[] args) {
        new Boss().command("加密",new Leader());
        new Boss().command("登录",new Leader());
    }
}
