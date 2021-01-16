package mq;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by qincasin on 2021/1/16.
 */
@Setter
@Getter
public class OrderMq {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
