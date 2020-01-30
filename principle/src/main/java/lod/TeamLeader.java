package lod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qincasin on 2020/1/30.
 */
public class TeamLeader {
    void checkNumOfCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("目前发布的课程数量为：" + courses.size());
    }
}
