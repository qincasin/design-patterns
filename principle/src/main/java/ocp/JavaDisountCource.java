package ocp;

/**
 *  java 折扣 课程
 * Created by qincasin on 2020/1/30.
 */

public class JavaDisountCource extends JavaCource{
    public JavaDisountCource(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }
}
