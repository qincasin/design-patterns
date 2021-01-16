package design.visit;

import java.util.Date;

/**
 * Created by qincasin on 2021/1/16.
 */
public class LotteryServiceImpl extends LotteryService{
    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        String lottery = minibusTargetService.lottery(uId);
        return new LotteryResult(uId,lottery,new Date());
    }
}
