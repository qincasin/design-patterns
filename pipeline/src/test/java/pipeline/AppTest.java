package pipeline;

import org.junit.jupiter.api.Test;

/**
 * Created by qincasin on 2020/3/15.
 * Use the Pipeline pattern when you want to
 * <p>
 * Execute individual stages that yields a final value
 * Add readability to complex sequence of operations by providing a fluent builder as an interface
 * Improve testability of code since stages will most likely be doing a single thing, complying to the Single Responsibility Principle (SRP)
 */
public class AppTest {
    @Test
    public void test() {
        App.main(new String[]{});
    }
}
