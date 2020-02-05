package factory;

/**
 * Created by qincasin on 2020/2/5.
 */
public class Client {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createVideo().record();
        courseFactory.createNote().edit();

        CourseFactory pythonFactory = new PythonCourseFactory();
        pythonFactory.createNote().edit();
        pythonFactory.createVideo().record();
    }
    abstract class A{
        abstract void test();
          void test2() throws ClassNotFoundException {
                String a = "";
              if (a == null) {
                  Class<?> aClass = Class.forName("com.apple.concurrent");
                  System.out.println(aClass);


              }
        }
    }
}
