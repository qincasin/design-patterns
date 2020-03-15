package pipeline;

import java.util.function.IntPredicate;

/**
 * Created by qincasin on 2020/3/15.
 * 去除字符串中的 字母
 */
public class RemoveAlphabetsHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        StringBuilder result = new StringBuilder();
        IntPredicate isAlphabetic = Character::isAlphabetic;
        input.chars()
                .filter(isAlphabetic.negate())
                .mapToObj(x -> (char) x)
                .forEachOrdered(result::append);
        String s = result.toString();

        String format = String.format(
                "Current handler: %s, input is %s of type %s, output is %s, of type %s",
                RemoveAlphabetsHandler.class, input,
                String.class, s, String.class
        );
        System.out.println(format);
        return s;
    }
}
