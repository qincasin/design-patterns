/**
 * Created by qincasin on 2020/10/24.
 */
public class AC110Adapter implements DC5Adapter {
    public static final int voltage = 110;

    @Override
    public boolean isSupport(AC ac) {
        return ac.output() == voltage;
    }

    @Override
    public int handle(AC ac) {
        int output = ac.output();
        int i = output / 22;
        System.out.println("变压器 : " + output + " 转换后的: " + i);
        return i;
    }
}
