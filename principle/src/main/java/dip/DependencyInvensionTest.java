package dip;

/**
 * Created by qincasin on 2020/1/30.
 * 依赖倒置原则 ： 高层模块不应该依赖底层模块，二者都可以依赖其抽象。
 *
 * 依赖导致原则是 可以减少类与类之间的耦合性，提高系统的稳定性，提高代码的可读性和可维护性，并且能够降低修改程序所造成的风险
 *  其实 spring'中的 DI就是 依赖导致原则  set 构造方法注入 接口
 *
 */
public class DependencyInvensionTest {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCource());
        tom.study(new PythonCource());
    }
}
