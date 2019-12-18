package design.facade.common;

/**
 * 门面对象 门面对象不能参与 业务逻辑  简单理解就是 a b c 三个提供出来的方法 不能互相调用
 */
public class Facade {
    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.c.doSomethingC();
    }

}
