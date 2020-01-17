public class Boss {
    public static void main(String[] args) {


        IProject project = new Project();

        project.add("项目1:", 10, 100000);
        project.add("项目2:", 20, 100000);
        project.add("项目3:", 30, 100000);

        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 10000);
        }

        //遍历
        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()){
            IProject next = (IProject)iterator.next();
            System.out.println(next.getProjectInfo());
        }
    }
}
