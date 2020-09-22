package promotion;

/**
 * Created by qincasin on 2020/9/22.
 * 无优惠策略类
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠策略类");
    }
}
