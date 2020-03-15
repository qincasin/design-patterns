package pipeline;

/**
 * Created by qincasin on 2020/3/15.
 */
public interface Handler<I,O> {
    O process(I input);
}
