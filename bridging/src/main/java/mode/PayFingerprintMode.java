package mode;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by qincasin on 2021/1/16.
 * 指纹支付
 */
@Slf4j
public class PayFingerprintMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        log.info("指纹支付，风控校验脸部识别");
        return true;
    }
}
