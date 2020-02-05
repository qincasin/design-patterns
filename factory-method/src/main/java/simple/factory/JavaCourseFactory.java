package simple.factory;

import simple.ICourse;
import simple.JavaCourse;

/**
 * Created by qincasin on 2020/2/5.
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
