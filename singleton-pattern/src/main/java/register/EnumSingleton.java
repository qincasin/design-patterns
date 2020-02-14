package register;

import annotations.ThreadSafe;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * Created by qincasin on 2020/2/13.
 * 注册式单例模式
 *
 */
@ThreadSafe
public enum EnumSingleton {
    /**
     *
     */
    INSTANCE;

    @Setter
    @Getter
    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 枚举类单例模式 序列化 反序列化 测试 T
     * 枚举类实现方式： 内部通过静态代码块给instance 进行赋值 是饿汉式的单例模式
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton instance1 = null;
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setData(new Object());

        FileOutputStream fileOutputStream = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance2);
        objectOutputStream.flush();
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        instance1 = (EnumSingleton) objectInputStream.readObject();
        fileInputStream.close();

        System.out.println("test1111");

        System.out.println(instance1.getData());
        System.out.println(instance2.getData());
        System.out.println(instance1 == instance2);


    }


}
