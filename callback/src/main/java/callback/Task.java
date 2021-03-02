package callback;

import java.util.Optional;

/**
 * Created by qincasin on 2020/3/14.
 * <p>
 * Template-method class for callback hook execution
 * 用于回调挂钩执行的模板方法类。
 */
public abstract class Task {


    /**
     * Execute with callback
     * @param callback
     */
    final void executeWith(final Callback callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    final void executeWith2(final Callback2 callback,String b) {
        execute();
        callback.call(b);
    }


    public abstract void execute();
}
