package template;

/**
 * Created by qincasin on 2020/9/22.
 */
public class BigDataCourse extends NetworkCourse{
    private Boolean needHomeWork = false;
    @Override
    protected void checkHomeWork() {
        System.out.println("检查大数据作业");
    }

    public BigDataCourse(Boolean needHomeWork) {
        this.needHomeWork = needHomeWork;
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWork;
    }
}
