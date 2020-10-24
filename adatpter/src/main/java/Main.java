/**
 * Created by qincasin on 2020/10/24.
 *  类适配器 使用 适配器 继承 适配者 实现目标抽响类/接口即可
 *  这样我们就可以在新的target 或中适配旧的 接口或者类
 */
public class Main{
    public static void main(String[] args) {
        Target target = new  Adapter();
        target.request();
    }
}
