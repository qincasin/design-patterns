package retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * Created by qincasin on 2020/3/19.
 */
public final class Retry<T> implements BusinessOperation<T> {
    private final BusinessOperation<T> op;
    private final int maxAttempts;
    private final Long delay;
    private final AtomicInteger attempts;
    private Predicate<Exception> test;
    private final List<Exception> errors;

    @SafeVarargs
    public Retry(BusinessOperation<T> op,
                 int maxAttempts,
                 Long delay,
                 Predicate<Exception>... ignoreTests) {
        this.op = op;
        this.maxAttempts = maxAttempts;
        this.delay = delay;
        this.attempts = new AtomicInteger();
        this.test = Arrays.stream(ignoreTests).reduce(Predicate::or).orElse(f -> false);
        this.errors = new ArrayList<>();

    }

    public List<Exception> errors() {
        return Collections.unmodifiableList(this.errors);
    }

    public int attempts() {
        return this.attempts.intValue();
    }


    @Override
    public T perform() throws BusinessException {
        do {
            try {
                return this.op.perform();
            } catch (BusinessException e) {
                this.errors.add(e);
                if (this.attempts.incrementAndGet() > maxAttempts || test.negate().test(e)) {
                    throw e;
                }
                try {
                    Thread.sleep(this.delay);
                } catch (InterruptedException f) {
                    //ignore
                }
            }
        } while (true);
    }
}
