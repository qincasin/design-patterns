package com.qjx.databus;

import com.qjx.databus.data.MessageData;
import com.qjx.databus.data.StartingData;
import com.qjx.databus.data.StoppingData;
import com.qjx.databus.members.CounterMember;
import com.qjx.databus.members.StatusMember;

import java.security.PublicKey;
import java.time.LocalDateTime;

/**
 * Created by qincasin on 2020/6/8.
 */
public class Main {
    public static void main(String[] args) {
        DataBus bus = DataBus.getInstance();

        bus.subscrib(new StatusMember(1));
        bus.subscrib(new StatusMember(2));

        CounterMember zhangsan = new CounterMember("zhangsan");
        CounterMember lisi = new CounterMember("lisi");
        bus.subscrib(zhangsan);
        bus.publist(StartingData.of(LocalDateTime.now()));
        bus.publist(MessageData.of("123213123eqweqw"));

        bus.subscrib(lisi);
        bus.publist(MessageData.of("两个都能获取到"));

        bus.unsubscrib(lisi);

        bus.publist(MessageData.of("一个能接受到 "));

        bus.publist(StoppingData.of(LocalDateTime.now()));

//        bus.subscrib(lisi);



    }
}
