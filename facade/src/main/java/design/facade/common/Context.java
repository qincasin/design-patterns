package design.facade.common;

/**
 * 封装类 封装 a 和c 对象中 互相调用 依赖关系
 */
public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    public void conplexMethod(){
       this.a.doSomethingA();
       this.c.doSomethingC();
    }
}
