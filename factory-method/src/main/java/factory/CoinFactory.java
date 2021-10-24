package factory;

/**
 * @author qinjx
 * @date 2021/10/24
 */
public class CoinFactory {
    public static Coin getCoin(CoinType type){
        return type.getConstructor().get();
    }
}
