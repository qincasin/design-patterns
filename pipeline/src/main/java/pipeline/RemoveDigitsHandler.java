package pipeline;

import java.util.function.IntPredicate;

/**
 * Created by qincasin on 2020/3/15.
 * 去除字符串中的 数字
 */
public class RemoveDigitsHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        StringBuilder result = new StringBuilder();
        IntPredicate isDigit = Character::isDigit;
        input.chars()
                .filter(isDigit.negate())
                .mapToObj(x -> (char) x)
                .forEachOrdered(result::append);
        String s = result.toString();

        String format = String.format(
                "Current handler: %s, input is %s of type %s, output is %s, of type %s",
                RemoveDigitsHandler.class, input,
                String.class, s, String.class
        );
        System.out.println(format);
        return s;
    }
}
