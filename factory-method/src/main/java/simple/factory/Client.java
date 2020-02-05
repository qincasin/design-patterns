package simple.factory;

import simple.ICourse;

/**
 * Created by qincasin on 2020/2/5.
 * 工厂方法
 */
public class Client {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();

        ICourseFactory factory1 = new PythonCourseFactory();
        ICourse iCourse1 = factory1.create();
        iCourse1.record();

    }
}
