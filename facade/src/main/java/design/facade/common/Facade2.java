package design.facade.common;

/**
 * 一个子系统可以有多个门面
 * 门面对象2 假如门面2 是只允许 访问 三个对象中的 b方法时
 */
public class Facade2 {
    //被委托的对象
    private ClassB b = new ClassB();

    //提供给外部访问的方法

    public void methodB() {
        this.b.doSomethingB();
    }

}
