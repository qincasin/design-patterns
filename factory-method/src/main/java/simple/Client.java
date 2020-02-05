package simple;

/**
 * Created by qincasin on 2020/2/5.
 */
public class Client {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse python = courseFactory.create("python");
        python.record();
        System.out.println("------使用反射来获取-------");
        ICourse byProxy = courseFactory.createByProxy("simplefactory.JavaCourse");
        byProxy.record();

        System.out.println("使用类实例化");
        ICourse iCourse = courseFactory.create(JavaCourse.class);
        iCourse.record();

    }
}
