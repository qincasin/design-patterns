package com.qjx.event;

import com.qjx.model.User;

/**
 * Created by qincasin on 2020/6/8.
 */
public class UserCreateEvent extends AbstractEvent{
    private User user;

    public UserCreateEvent(User user) {
        this.user = user;
    }
    public User getUser(){
        return user;
    }

}
