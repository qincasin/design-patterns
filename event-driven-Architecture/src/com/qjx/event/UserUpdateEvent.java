package com.qjx.event;

import com.qjx.model.User;

/**
 * Created by qincasin on 2020/6/8.
 */
public class UserUpdateEvent extends AbstractEvent{
   private User user;

    public UserUpdateEvent(User user) {
        this.user = user;
    }
    public User getUser(){
        return user;
    }
}
