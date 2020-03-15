package pipeline;

/**
 * Main Pipeline class that initially sets the current handler. Processed output of the initial
 * handler is then passed as the input to the next stage handlers
 *
 * @param <I>
 * @param <O>
 */
public class Pipeline<I, O> {
    private final Handler<I, O> currentHandler;

    public Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    <K> Pipeline<I, K> addHandler(final Handler<O, K> newHandler) {
        return new Pipeline<>(input -> newHandler.process(currentHandler.process(input)));
    }

    O execute(I input) {
        return currentHandler.process(input);
    }
}
