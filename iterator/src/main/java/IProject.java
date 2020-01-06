/**
 * 项目信息接口
 */
public interface IProject {
    void add(String name, Integer num, Integer cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
