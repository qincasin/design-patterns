package delegate;

/**
 * 模拟一个 老板指派项目经理下达任务，项目经理给员工派发任务，待员工把任务做完，在有项目经理向老板汇报
 */
public interface IEmployee {
    void doing(String command);
}
