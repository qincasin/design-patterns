package com.qjx.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qincasin on 2020/6/8.
 * 具体处理event 的对应关系
 * <p>
 * 包含注册 以及 调度
 */
public class EventDispatcher  {

    Map<Class<? extends Event>, Handle<? extends Event>> handleMap;

    public EventDispatcher() {
        handleMap = new HashMap<>();
    }

    /**
     * 注册
     * @param eventType
     * @param handle
     * @param <E>
     */
    public <E extends Event> void registerHandle(Class<E> eventType, Handle<E> handle) {
        handleMap.put(eventType,handle);
    }

    /**
     * 调度
     * @param event
     * @param <E>
     */
    public <E extends Event> void dispatch(E event){

        Handle<E> handle = (Handle<E>) handleMap.get(event.getClass());
        if (handle != null) {
            handle.onEvent(event);
        }
    }

}
