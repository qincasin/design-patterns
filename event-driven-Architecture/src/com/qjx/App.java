package com.qjx;

import com.qjx.event.UserCreateEvent;
import com.qjx.event.UserUpdateEvent;
import com.qjx.framework.EventDispatcher;
import com.qjx.handle.UserCreateEventHandler;
import com.qjx.handle.UserUpdateEventHandler;
import com.qjx.model.User;

/**
 * Created by qincasin on 2020/6/8.
 */
public class App {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerHandle(UserCreateEvent.class,new UserCreateEventHandler());
        dispatcher.registerHandle(UserUpdateEvent.class,new UserUpdateEventHandler());

        dispatcher.dispatch(new UserCreateEvent(new User("123")));
        dispatcher.dispatch(new UserUpdateEvent(new User("234")));

    }
}
