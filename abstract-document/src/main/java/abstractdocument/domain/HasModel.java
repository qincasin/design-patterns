package abstractdocument.domain;

import abstractdocument.Document;
import abstractdocument.domain.enums.Property;

import java.util.Optional;

/**
 * Created by qincasin on 2020/3/18.
 */
public interface HasModel extends Document {
   default Optional<String> getModel(){
       return Optional.ofNullable((String)get(Property.MODEL.toString()));
   }
}
