import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by qincasin on 2020/1/7.
 */
//以1个UserService为例，使用jdk自带的代理模式完成计算方法调用时间的需求：
public interface IUserService {
    void printAll();

}
class UserService implements IUserService{
    @Override
    public void printAll() {
        System.out.println("print all users");
    }
}

// InvocationHandler策略，这里打印了方法调用前后的时间
@AllArgsConstructor
class UserInvocationHandler implements InvocationHandler{
    private IUserService userService;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start:"+System.currentTimeMillis());
        Object invoke = method.invoke(userService, args);
        System.out.println("end:"+System.currentTimeMillis());
        return invoke;
    }
}
class Test{
    public static void main(String[] args) {
        IUserService userService = new UserService();
        UserInvocationHandler handler = new UserInvocationHandler(userService);
        IUserService proxyInstance = (IUserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), new Class[]{IUserService.class}, handler);
        proxyInstance.printAll();
    }
}
