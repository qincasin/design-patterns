package design.observer;

/**
 * 具体的观察者
 */
public class WangSi implements Observer {
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，开始向老板汇报....");
        this.cry(context);
        System.out.println("王斯： 哭死了 ");
    }

    private void cry(String context) {
        System.out.println("王斯：报告，因为"+context+"所以我悲伤呀");
    }
}
