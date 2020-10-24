/**
 * Created by qincasin on 2020/10/24.
 * 适配者类
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.test();
    }
}
