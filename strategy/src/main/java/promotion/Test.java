package promotion;

/**
 * Created by qincasin on 2020/9/22.
 */
public class Test {
    public static void main(String[] args) {
        String promotion = "groupBuy";
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotion(promotion));
        activity.execute();

    }
}
