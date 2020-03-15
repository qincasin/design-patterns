package pipeline;

/**
 * Created by qincasin on 2020/3/15.
 */
public class App {
    public static void main(String[] args) {
         /*
      Suppose we wanted to pass through a String to a series of filtering stages and convert it
      as a char array on the last stage.
      - Stage handler 1 (pipe): Removing the alphabets, accepts a String input and returns the
      processed String output. This will be used by the next handler as its input.
      - Stage handler 2 (pipe): Removing the digits, accepts a String input and returns the
      processed String output. This shall also be used by the last handler we have.
      - Stage handler 3 (pipe): Converting the String input to a char array handler. We would
      be returning a different type in here since that is what's specified by the requirement.
      This means that at any stages along the pipeline, the handler can return any type of data
      as long as it fulfills the requirements for the next handler's input.
      Suppose we wanted to add another handler after ConvertToCharArrayHandler. That handler
      then is expected to receive an input of char[] array since that is the type being returned
      by the previous handler, ConvertToCharArrayHandler.
     */

        new Pipeline<>(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());

    }
}
