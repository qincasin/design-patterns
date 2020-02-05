package simple;

/**
 *
 * @author qincasin
 * @date 2020/2/5
 */
public class CourseFactory {
    ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();

        }else if ("python".equals(name)){
            return new PythonCource();
        }else {
            return null;
        }
    }

    ICourse createByProxy(String className){
        if(!(null==className||"".equals(className))){
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    ICourse create(Class<?extends ICourse> clazz){
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
