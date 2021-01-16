package design.visit.event.listener;

import design.visit.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by qincasin on 2021/1/16.
 * 短信消息事件
 */
@Slf4j
public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信)：{}", result.getuId(), result.getMsg());
    }
}
