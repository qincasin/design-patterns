package com.qjx.balking;

import java.util.concurrent.TimeUnit;

/**
 * Created by qincasin on 2020/6/9.
 * 模拟延迟使用
 */
public interface DelayProvider {
    void executeAfterDelay(long interval, TimeUnit timeUnit, Runnable runnable);
}
