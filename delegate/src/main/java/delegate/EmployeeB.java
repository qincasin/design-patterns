package delegate;

/**
 * Created by qincasin on 2020/9/22.
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("B  在完成 command "+command+"任务");
    }
}
