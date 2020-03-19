package retry;

/**
 *
 * @author qincasin
 * @date 2020/3/19
 */
public class DatabaseNotAvailableException extends Exception{

    public DatabaseNotAvailableException(String message) {
        super(message);
    }
}
