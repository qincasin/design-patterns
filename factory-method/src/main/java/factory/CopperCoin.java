package factory;

/**
 * @author qinjx
 * @date 2021/10/24
 */
//铜币
public class CopperCoin implements Coin{
    static final String DESC = "这是一个铜币";
    @Override
    public String getDesc() {
        return DESC;
    }
}
