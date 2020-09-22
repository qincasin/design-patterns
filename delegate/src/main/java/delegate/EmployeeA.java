package delegate;

/**
 * Created by qincasin on 2020/9/22.
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("A 在完成 command "+command+"任务");
    }
}
