package abstractdocument;

import abstractdocument.domain.Car;
import abstractdocument.domain.enums.Property;

import java.util.List;
import java.util.Map;

/**
 * Created by qincasin on 2020/3/18.
 */
public class App {
    public App() {
        System.out.println("start.....");
        //车轮
        var wheepProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), "100L"
        );
        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "lambo",
                Property.PRICE.toString(), "300L"
        );
        var carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), "1000C",
                Property.PARTS.toString(), List.of(wheepProperties, doorProperties)
        );

        var car = new Car(carProperties);

        System.out.println(car);

        System.out.println("hear is out car:");
        System.out.println("model:" + car.getModel().orElseThrow());
        System.out.println("price:" + car.getPrice().orElseThrow());
        System.out.println("parts:");
        car.getParts().forEach(p -> System.out.println(p.getType().orElse(null) + " "
                + p.getModel().orElse(null) + " "
                + p.getPrice().orElse(null)));

    }

    public static void main(String[] args) {
        new App();
    }
}
