package template;

/**
 * Created by qincasin on 2020/9/22.
 */
public class Main {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();


        System.out.println("--------------");

        BigDataCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
