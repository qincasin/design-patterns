package com.qjx.databus.members;

import com.qjx.databus.DataType;
import com.qjx.databus.Member;
import com.qjx.databus.data.MessageData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qincasin on 2020/6/8.
 */
public class CounterMember implements Member {

    private String name;

    private List<String> list = new ArrayList<>();

    public CounterMember(String name) {
        this.name = name;
    }

    private void handleEvent(MessageData messageData){
        System.out.println(name+ " 接收到 "+messageData.getMessage());
       list.add(messageData.getMessage());
    }

    @Override
    public void accept(DataType event) {
        if(event instanceof MessageData){
            handleEvent((MessageData) event);
        }
    }

//    public List<String> getMessages() {
//        return List.copy(list);
//    }

}
