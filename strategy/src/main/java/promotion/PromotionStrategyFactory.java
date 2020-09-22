package promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qincasin on 2020/9/22.
 * 工厂和单例模式优化 和策略模式结合
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> map = new HashMap<>();

    static {
        map.put(PromotionKey.coupon, new CouponStrategy());
        map.put(PromotionKey.cashBack, new CashBackStrategy());
        map.put(PromotionKey.groupBuy, new GroupBuyStrategy());
    }

    private static final PromotionStrategy nonPromotion = new EmptyStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotion(String promotionKey) {
        PromotionStrategy strategy = map.get(promotionKey);
        return strategy == null ? nonPromotion : strategy;
    }

    private interface PromotionKey {
        String coupon = "coupon";
        String cashBack = "cachBack";
        String groupBuy = "groupBuy";
    }
}
