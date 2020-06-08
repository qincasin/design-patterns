package com.qjx.framework;

/**
 * Created by qincasin on 2020/6/8.
 */
public interface Event {

    Class<? extends Event> getType();
}
