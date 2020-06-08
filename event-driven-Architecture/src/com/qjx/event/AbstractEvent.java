package com.qjx.event;

import com.qjx.framework.Event;

/**
 * Created by qincasin on 2020/6/8.
 */
public abstract class AbstractEvent implements Event {

    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }
}
