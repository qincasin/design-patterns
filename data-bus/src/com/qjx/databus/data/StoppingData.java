package com.qjx.databus.data;

import com.qjx.databus.AbstractDataType;
import com.qjx.databus.DataType;

import java.time.LocalDateTime;

/**
 * Created by qincasin on 2020/6/8.
 */
public class StoppingData extends AbstractDataType {
    private LocalDateTime time;

    public StoppingData(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getEndTime(){
        return time;
    }

    public static DataType of (LocalDateTime time){
        return new StoppingData(time);
    }
}
