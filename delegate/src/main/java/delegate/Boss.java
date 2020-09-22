package delegate;

/**
 * Created by qincasin on 2020/9/22.
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
