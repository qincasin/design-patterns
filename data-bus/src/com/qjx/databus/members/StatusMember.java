package com.qjx.databus.members;

import com.qjx.databus.AbstractDataType;
import com.qjx.databus.DataType;
import com.qjx.databus.Member;
import com.qjx.databus.data.MessageData;
import com.qjx.databus.data.StartingData;
import com.qjx.databus.data.StoppingData;

import java.time.LocalDateTime;

/**
 * Created by qincasin on 2020/6/8.
 */
public class StatusMember implements Member {

    private Integer id;
    private LocalDateTime started;
    private LocalDateTime stopped;


    public StatusMember(Integer id) {
        this.id = id;
    }

    private void handelEventData(StartingData data) {
        System.out.println("starting data:" + data.getStartTime());
    }

    private void handelEventData(StoppingData data) {
        System.out.println("stopping data :"+ data.getEndTime());
        data.getDataBus().publist(MessageData.of(id.toString()));
    }


    @Override
    public void accept(DataType dataType) {

        if (dataType instanceof StartingData) {
            handelEventData((StartingData) dataType);
        } else if (dataType instanceof StoppingData) {
            handelEventData((StoppingData) dataType);
        }

    }


    public LocalDateTime getStarted() {
        return started;
    }

    public LocalDateTime getStopped() {
        return stopped;
    }


}
