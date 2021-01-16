import channel.Pay;
import channel.WxPay;
import channel.ZfbPay;
import mode.PayFaceMode;
import mode.PayFingerprintMode;

import java.math.BigDecimal;

/**
 * Created by qincasin on 2021/1/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("模拟微信人脸方式");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111","100000109893",new BigDecimal(100));

        System.out.println("模拟支付宝 指纹支付");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
