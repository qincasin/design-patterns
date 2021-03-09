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
    /**
     * 左侧 Pay 是⼀个抽象类，往下是它的两个⽀付类型实现；微信⽀付、⽀付宝⽀付。
     * 右侧 IPayMode 是⼀个接⼝，往下是它的两个⽀付模型；刷脸⽀付、指纹⽀付。
     * 那么， ⽀付类型 × ⽀付模型 = 就可以得到相应的组合。
     * 注意，每种⽀付⽅式的不同，刷脸和指纹校验逻辑也有差异，可以使⽤适配器模式进⾏处理，这⾥
     * 不是本⽂᯿点不做介绍，可以看适配器模式章节。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("模拟微信人脸方式");
        //模拟查询db中的数据，如果有多个，按照顺序进行初始化
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111","100000109893",new BigDecimal(100));

        System.out.println("模拟支付宝 指纹支付");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
