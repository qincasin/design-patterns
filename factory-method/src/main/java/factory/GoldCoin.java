package factory;

/**
 * @author qinjx
 * @date 2021/10/24
 */
//金币
public class GoldCoin implements Coin{
    static final String DESC = "这是一个金币";
    @Override
    public String getDesc() {
        return DESC;
    }
}
