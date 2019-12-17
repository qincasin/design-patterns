package design.observer;

/**
 * 具体的观察者
 */
public class LiuSi implements Observer {
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，开始向老板汇报....");
        this.happy(context);
        System.out.println("王斯： 快乐死了 ");
    }

    private void happy(String context) {
        System.out.println("王斯：报告，因为"+context+"所以我快乐呀");
    }
}
