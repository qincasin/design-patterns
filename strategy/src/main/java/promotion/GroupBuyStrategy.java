package promotion;

/**
 * Created by qincasin on 2020/9/22.
 * 拼团策略类
 */
public class GroupBuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团策略类");
    }
}
