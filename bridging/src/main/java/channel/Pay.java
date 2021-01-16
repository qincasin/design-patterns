package channel;

import lombok.extern.slf4j.Slf4j;
import mode.IPayMode;

import java.math.BigDecimal;

/**
 * Created by qincasin on 2021/1/16.
 * 支付类型桥接抽象类
 */
@Slf4j
public abstract class Pay {
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uid, String tradeId, BigDecimal amout);
}
