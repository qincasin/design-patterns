package mode;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by qincasin on 2021/1/16.
 * 密码
 */
@Slf4j
public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验脸部识别");
        return true;
    }
}
