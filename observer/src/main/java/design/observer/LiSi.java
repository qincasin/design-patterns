package design.observer;

/**
 * 具体的观察者
 */
public class LiSi implements Observer {
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报....");
        this.reportToQinShiHuang(context);
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：报告，秦老板，韩非子有活动了--》" + context);
    }
}
