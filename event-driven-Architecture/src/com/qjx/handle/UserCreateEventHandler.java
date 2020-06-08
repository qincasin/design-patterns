package com.qjx.handle;

import com.qjx.event.UserCreateEvent;
import com.qjx.event.UserUpdateEvent;
import com.qjx.framework.Handle;

/**
 * Created by qincasin on 2020/6/8.
 * 具体handle 事件
 */
public class UserCreateEventHandler implements Handle<UserCreateEvent> {
    @Override
    public void onEvent(UserCreateEvent event) {
        System.out.println("用户创建事件被触发了 :" + event.getUser().getUsername());
    }
}
