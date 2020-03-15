package callback;



/**
 * Created by qincasin on 2020/3/14.
 */
public class SimpleTask extends Task {


    @Override
    public void execute() {
        System.out.println(("Perform some important activity and after call the callback method"));
    }
}
