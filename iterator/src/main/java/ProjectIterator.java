import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator {

    private List<IProject> projectList = new ArrayList<IProject>();

    //游标
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        boolean b = true;
        if (currentItem >= projectList.size() || projectList.get(currentItem) == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        IProject iProject = this.projectList.get(this.currentItem++);
        return iProject;
    }

    public void remove() {

    }
}
