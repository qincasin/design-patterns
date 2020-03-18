package abstractdocument.domain;

import abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * Created by qincasin on 2020/3/17.
 */
public class Parts extends AbstractDocument implements HasModel, HasPrice, HasType {
    public Parts(Map<String, Object> properties) {
        super(properties);
    }
}
