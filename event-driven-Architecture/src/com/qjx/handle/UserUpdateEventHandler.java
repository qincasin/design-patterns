package com.qjx.handle;

import com.qjx.event.UserUpdateEvent;
import com.qjx.framework.Handle;

/**
 * Created by qincasin on 2020/6/8.
 * 具体handle 事件
 */
public class UserUpdateEventHandler implements Handle<UserUpdateEvent> {
    @Override
    public void onEvent(UserUpdateEvent event) {
        System.out.println("用户修改事件被触发了 :" + event.getUser().getUsername());
    }
}
