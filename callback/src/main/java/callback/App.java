package callback;



/**
 * Created by qincasin on 2020/3/14.
 */

import lombok.var;

/**
 * Callback pattern is more native for functional languages where functions are treated as
 * first-class citizens. Prior to Java 8 callbacks can be simulated using simple (alike command)
 * interfaces.
 */

public class App {
    private App(){

    }
    public static void main(String[] args) {
        Task task = new SimpleTask();
        long a = 1L;
        task.executeWith(TestCall::new);


        task.execute();

    }
}
