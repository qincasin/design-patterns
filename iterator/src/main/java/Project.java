import java.util.ArrayList;
import java.util.List;

/**
 * 项目信息接口实现类
 */
public class Project implements IProject {
    //项目名字
    private String name;
    //项目成员数量
    private Integer num;
    //项目花销
    private Integer cost;

    //定义一个项目 所有的项目列表放在这里
    private List<IProject> projectList = new ArrayList<IProject>();

    public Project() {
    }

    private Project(String name, Integer num, Integer cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public void add(String name, Integer num, Integer cost) {
        projectList.add(new Project(name, num, cost));
    }

    public String getProjectInfo() {
        String info = "";
        info = info + " 项目名：" + this.name;

        info = info + " \t 项目人数:" + this.num;

        info = info + " \t 项目人数:" + this.cost;

        return info;
    }

    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
