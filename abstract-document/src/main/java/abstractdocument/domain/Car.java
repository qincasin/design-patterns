package abstractdocument.domain;

import abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * Created by qincasin on 2020/3/17.
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
