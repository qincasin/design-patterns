package retry;

/**
 * Created by qincasin on 2020/3/19.
 */
public class App {
    private static BusinessOperation<String> op;

    public static void main(String[] args) throws Exception {

        noErrors();
        errorNoRetry();
        errorWithRetry();
        errorWithRetryExponentialBackoff();


    }


    private static void noErrors() throws Exception {
        op = new FindCustomer("123");
        String perform = op.perform();
        System.out.println(perform);
    }

    private static void errorNoRetry() throws Exception {
        op = new FindCustomer("123", new CustomerNotFoundException("not find"));
        try {
            String perform = op.perform();
            System.out.println(perform);
        } catch (CustomerNotFoundException e) {
            System.out.println("eeee");
        }
    }

    private static <T> void errorWithRetry() throws Exception {
        final var retry = new Retry<>(
                new FindCustomer("123", new CustomerNotFoundException("not found")),
                3,  //3 attempts
                100L, //100 ms delay between attempts
                e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass())
        );
        op = retry;
        final var customId = op.perform();
        System.out.println(customId + " " + retry + "  " + retry.attempts());

    }

    private static void errorWithRetryExponentialBackoff() throws Exception {
        final var retry = new RetryExponentialBackOff<>(
                new FindCustomer("123", new CustomerNotFoundException("not find")),
                6,
                3000L,
                //class1.isAssignableFrom(class2)   class2是不是class1的子类或者子接口
                e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass())
        );
        op = retry;
        final var customId = op.perform();
        System.out.println("customID:" + customId + "  retryAttepts:" + retry.attempts());
    }

}
