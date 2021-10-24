package factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinjx
 * @date 2021/10/24
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        Coin coin = CoinFactory.getCoin(CoinType.COPPER);
        Coin coin2 = CoinFactory.getCoin(CoinType.GOLD);
        log.info("{}",coin.getDesc());
        log.info("{}",coin2.getDesc());
//        System.out.println(coin.getDesc());
//        System.out.println(coin2.getDesc());
    }
}
