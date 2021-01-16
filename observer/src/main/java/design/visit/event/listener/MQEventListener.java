package design.visit.event.listener;

import design.visit.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by qincasin on 2021/1/16.
 * MQ发送事件
 */
@Slf4j
public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        log.info("记录用户 {} 摇号结果(MQ)：{}", result.getuId(), result.getMsg());

    }
}
