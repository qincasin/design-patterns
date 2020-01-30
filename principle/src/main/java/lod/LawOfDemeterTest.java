package lod;

/**
 * Created by qincasin on 2020/1/30.
 * 迪米特法则：一个对象应该对其他对象保持最少的了解，又叫做最少知道原则(Least Knowledge Principle,LKP)，尽量降低类与类之间的耦合度。
 * 本法则强调：只和朋友交流，不和陌生人说话。出现的成员变量、方法的输入、输出参数中的类打都可以成为朋友，而出现在方法体内部的类不属于朋友
 * 现在通过一个权限系统中的查看来体现该原则：
 *  boss 需要查询发布线上的课程，这时候boss需要找teamLeader去进行统计，teamleader把统计结果告知boss
 */
public class LawOfDemeterTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader leader = new TeamLeader();
        boss.commandCheckNumber(leader);
    }
}
