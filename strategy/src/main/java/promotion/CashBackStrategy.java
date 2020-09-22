package promotion;

/**
 * Created by qincasin on 2020/9/22.
 * 现金抵扣策略
 */
public class CashBackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("现金抵扣策略类");
    }
}
