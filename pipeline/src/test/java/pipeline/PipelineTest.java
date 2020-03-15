package pipeline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * Created by qincasin on 2020/3/15.
 */
public class PipelineTest {
    @Test
    public void test() {
        Pipeline<String, char[]> filter = new Pipeline<>(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());

        System.out.println("resut:" + Arrays.toString(filter.execute("#H!E(L&L0O%THE3R#34E!")));

        assertArrayEquals(
                new char[]{'#', '!', '(', '&', '%', '#', '!'},
                filter.execute("#H!E(L&L0O%THE3R#34E!")
        );
    }
}
