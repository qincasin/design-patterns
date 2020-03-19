package retry;

/**
 *
 * @author qincasin
 * @date 2020/3/19
 */
public class CustomerNotFoundException extends BusinessException{

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
