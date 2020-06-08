package com.qjx.framework;

/**
 * Created by qincasin on 2020/6/8.
 * handle 事件接口
 */
public interface Handle<E extends Event> {

    void onEvent(E event);

}
