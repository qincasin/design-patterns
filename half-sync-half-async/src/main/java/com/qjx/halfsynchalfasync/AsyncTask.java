package com.qjx.halfsynchalfasync;

import java.util.concurrent.Callable;

/**
 * Created by qincasin on 2020/6/16.
 */
public interface AsyncTask<O> extends Callable<O> {
    /**
     * 前置调用
     */
    void onPreCall();

    /**
     * 调用完
     * @param result
     */
    void onPostCall(O result);

    void onError(Throwable throwable);

    @Override
    O call() throws Exception;

}
