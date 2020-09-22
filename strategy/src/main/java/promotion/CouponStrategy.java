package promotion;

/**
 * Created by qincasin on 2020/9/22.
 * 优惠券抵扣策略类
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠券抵扣策略");
    }
}
