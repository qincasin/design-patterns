package com.qjx.databus.data;

import com.qjx.databus.AbstractDataType;
import com.qjx.databus.DataType;

import java.time.LocalDateTime;

/**
 * Created by qincasin on 2020/6/8.
 */
public class StartingData extends AbstractDataType {

    private LocalDateTime time;

    public StartingData(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getStartTime(){
        return time;
    }
    public static DataType of(LocalDateTime dateTime){
        return new StartingData(dateTime);
    }
}
