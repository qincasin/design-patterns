package com.qjx.databus.data;

import com.qjx.databus.AbstractDataType;
import com.qjx.databus.DataType;

/**
 * Created by qincasin on 2020/6/8.
 */
public class MessageData extends AbstractDataType {

    private String message;

    public MessageData(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public static DataType of(String message){
        return new MessageData(message);
    }
}
