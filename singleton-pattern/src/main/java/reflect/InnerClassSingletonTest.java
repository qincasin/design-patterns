package reflect;

import lazy.InnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射 破坏单例模式
 * Created by qincasin on 2020/2/10.
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = InnerClassSingleton.class;
        //通过反射获取私有方法

        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        //强制访问
        constructor.setAccessible(true);

        //相当于new 了两次
        Object o = constructor.newInstance();

        Object o1 = constructor.newInstance();

        System.out.println(o == o1);


    }

}
