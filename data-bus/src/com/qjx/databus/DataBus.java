package com.qjx.databus;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qincasin on 2020/6/8.
 */
public class DataBus {
    //单例的
    // 订阅 、取消   发布
    private static final DataBus INSTANCE = new DataBus();


    public static DataBus getInstance(){
        return INSTANCE;
    }


    //listener
    Set<Member> listeners = new HashSet<>();


    public void publist(DataType event){

        event.setDataBus(this);

        for (Member listener : listeners) {
            listener.accept(event);
        }
    }

    public void subscrib(Member member){
        listeners.add(member);
    }

    public void unsubscrib(Member member){
        listeners.remove(member);
    }

}
