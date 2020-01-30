package isp;

/**
 * Created by qincasin on 2020/1/30.
 * 动物行为的抽象类 有dog 、bird 来实现该接口，因此该接口需要拆分
 */

public interface IAnimal {
    void eat();

    void fly();

    void swim();
}
