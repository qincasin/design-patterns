import java.util.LinkedList;
import java.util.List;

/**
 * Created by qincasin on 2020/10/24. 电压适配器  对象适配器器 组合模式
 */

public class Main2 {
    private List<DC5Adapter> adapters = new LinkedList<>();
    public Main2() {
        adapters.add(new AC110Adapter());
        adapters.add(new AC220Adapter());
    }

    public DC5Adapter getPowerAdapter(AC ac){
        DC5Adapter adapter = null;
        for (DC5Adapter ad : this.adapters) {
            if (ad.isSupport(ac)) {
                adapter = ad;
                break;
            }
        }
        if (adapter==null){
            throw new IllegalArgumentException("没有找到合适的变压器");
        }
        return adapter;
    }

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        AC ac200 = new AC220();
        DC5Adapter powerAdapter = main2.getPowerAdapter(ac200);
        System.out.println(powerAdapter.handle(ac200));

        AC ac100 = new AC110();
        DC5Adapter adapter = main2.getPowerAdapter(ac100);
        System.out.println(adapter.handle(ac100));
    }
}
