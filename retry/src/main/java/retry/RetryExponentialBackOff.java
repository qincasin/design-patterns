package retry;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * Created by qincasin on 2020/3/19.
 */
public final class RetryExponentialBackOff<T> implements BusinessOperation<T> {
    private static final Random RANDOM = new Random();
    private final BusinessOperation<T> op;
    private final int maxAttempts;
    private final Long maxDelay;
    private final AtomicInteger attempts;
    private Predicate<Exception> test;
    private final List<Exception> errors;

    public RetryExponentialBackOff(BusinessOperation<T> op,
                                   int maxAttempts,
                                   Long maxDelay,
                                   Predicate<Exception>... ignoreTests) {
        this.op = op;
        this.maxAttempts = maxAttempts;
        this.maxDelay = maxDelay;
        this.attempts = new AtomicInteger();
        test = Arrays.stream(ignoreTests).reduce(Predicate::or).orElse(f -> false);
        errors = new ArrayList<>();
    }

    public List<Exception> errors() {
        return Collections.unmodifiableList(this.errors);
    }

    public int attempts(){
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
                    var testDelay = (long) Math.pow(2, this.attempts()) * 1000 + RANDOM.nextInt(1000);
                    var delay = Math.min(testDelay,this.maxDelay);
                    Thread.sleep(delay);
                } catch (InterruptedException f) {
                    //ignore
                }
            }
        } while (true);
    }
}
