package retry;

/**
 * Created by qincasin on 2020/3/19.
 */
@FunctionalInterface
public interface BusinessOperation<T> {

    /**
     * Performs some business operation, returning a value {@code T} if successful, otherwise throwing
     * an exception if an error occurs.
     *
     * @return
     * @throws BusinessException
     */
    T perform() throws BusinessException;
}
