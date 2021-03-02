package push;

/**
 * Created by qincasin on 2021/3/1.
 * 模板 + 策略结合
 */
public abstract class AbstractPushStrategy implements PushStrategy {
    @Override
    public String push(Integer type, String message) {
        //1.构造span
        buildSpan();
        //2.子类实现
        String result = doPush(type,message);
        //3.是否允许重试



        finish();

        return null;
    }

    protected abstract String doPush(Integer type, String message);

    private void finish() {
        System.out.println("span finish ");
    }

    private void buildSpan(){
        System.out.println("开始span");
    }
}
