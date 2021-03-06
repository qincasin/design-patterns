package abstractdocument.domain;

import abstractdocument.Document;
import abstractdocument.domain.enums.Property;

import java.util.Optional;

/**
 * Created by qincasin on 2020/3/18.
 */
public interface HasType extends Document {
   default Optional<String> getType(){
       return Optional.ofNullable((String)get(Property.TYPE.toString()));
   }
}
