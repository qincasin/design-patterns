package simple.factory;

import simple.ICourse;
import simple.JavaCourse;
import simple.PythonCource;

/**
 * Created by qincasin on 2020/2/5.
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCource();
    }
}
