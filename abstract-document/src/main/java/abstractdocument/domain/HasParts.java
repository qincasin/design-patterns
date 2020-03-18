package abstractdocument.domain;

import abstractdocument.Document;
import abstractdocument.domain.enums.Property;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by qincasin on 2020/3/18.
 */
public interface HasParts extends Document {
    default Stream<Parts> getParts() {
        return children(Property.PARTS.toString(), Parts::new);
    }
}
