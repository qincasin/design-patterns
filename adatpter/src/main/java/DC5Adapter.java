/**
 * 200V ->5 v
 * 或者 100v ---> 5v
 */
public interface DC5Adapter {
    boolean isSupport(AC ac);

    int handle(AC ac);
}
