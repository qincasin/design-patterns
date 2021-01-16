package channel;

import lombok.extern.slf4j.Slf4j;
import mode.IPayMode;

import java.math.BigDecimal;

/**
 * Created by qincasin on 2021/1/16.
 */
@Slf4j
public class ZfbPay extends Pay{

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amout) {
        boolean security = payMode.security(uid);
        if(!security){
            log.info("支付宝失败！");
            return "0001";
        }
        log.info("支付宝成功");
        return "0000";
    }
}
