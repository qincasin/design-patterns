package pipeline;

import java.util.Arrays;

/**
 * Created by qincasin on 2020/3/15.
 * input 转换成 char[] array
 */
public class ConvertToCharArrayHandler implements Handler<String, char[]> {
    @Override
    public char[] process(String input) {
        char[] chars = input.toCharArray();
        String s = Arrays.toString(chars);
        String format = String.format("Current handler: %s,input is %s of type %s,output is %s,of type %s",
                ConvertToCharArrayHandler.class, input, String.class, s, Character[].class);
        System.out.println(format);
        return chars;
    }
}
