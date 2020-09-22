package delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qincasin on 2020/9/22.
 * 委托类
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> map = new HashMap<>();

    public Leader() {
        map.put("加密",new EmployeeA());
        map.put("登录",new EmployeeB());
    }

    //项目经理自己不干活的
    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }
}
