package lsp;

/**
 * Created by qincasin on 2020/1/30.
 * 里氏替代原则：如果迪一个类型为T1的对象O1，都有类型为T2的对象O2，使得以T1定义的所有程序P在所有的对象O1都替换成O2时，
 * 程序P的行为没有发生变化，那么类型T2是类型T1的子类型
 * 简单来说就是 子类可以替换父类的对象，而程序的逻辑不改变、根据这个理解可以引申含义为：
 * 子类可以扩展父类的功能，但不能改变父类原有的功能
 *  1.子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 *  2.子类可以增加自己特有的方法
 *  3.当子类的方法的重载父类的方法时，方法的前置条件（即方法的输入/输出）要比父类方法的输入参数更宽松
 *  4.当子类的方法实现父类的方法时(重写/重载或实现抽象方法)，方法的后置条件(即方法的输入/返回值)要比父类更严格或与父类一样
 *  使用里氏替代原则有如下优点：
 *   1.约束集成泛滥，是开闭原则的一种体现 --- 不修改原来已有的方法，通过继承实现来扩展已有的方法
 *   2.加强程序的健壮性，同时变更也可以做到非常好的兼容性，提高程序的可维护性和扩展性，降低需求变更时引入的风险
 */
public class LiskovSubstitutionPrincipleTest {
}
