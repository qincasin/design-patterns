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
}
