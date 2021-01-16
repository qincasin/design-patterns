package design.visit;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by qincasin on 2021/1/16.
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        LotteryService service =new LotteryServiceImpl();
        LotteryResult draw = service.draw("2765789109876");
        log.info("测试结果:{}", JSON.toJSONString(draw));

        service.draw("12313123");
    }
}
