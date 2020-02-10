package seriable;

import java.io.*;

/**
 * @author qincasin
 * @date 2020/2/10
 * 反序列化导致破坏单利模式
 * 饿汉式
 */
public class SeriableSingleton implements Serializable {
    /**
     * 序列化 就是 把内存中的状态转换成字节码的形式
     * 从而转换一个I/O流，写入其他地方(可以是磁盘、网络I/O)
     * 内存中的状态会永久保存下来
     * 反序列化：就是将已经持久化的字节码内容转换为I/O流
     * 通过I/O的读取，进而将读取的内容转换为Java对象
     * 在转换过程中会重新创建对象 new
     */

    private static final SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return instance;
    }

    //防止反序列化
    private Object readResolve() {
        return instance;
    }

    //测试 序列化 反序列化
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("seriableSingleton.obj");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(s2);
            outputStream.flush();
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream("seriableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (SeriableSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
