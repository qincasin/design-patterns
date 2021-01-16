package design.visit;

import design.visit.event.EventManager;
import design.visit.event.listener.MQEventListener;
import design.visit.event.listener.MessageEventListener;

/**
 * Created by qincasin on 2021/1/16.
 */
public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult result = doDraw(uId);
        //需要什么通知就调用什么通知
        eventManager.notify(EventManager.EventType.MQ, result);
        eventManager.notify(EventManager.EventType.Message, result);
        return result;
    }

    protected abstract LotteryResult doDraw(String uId);


}
