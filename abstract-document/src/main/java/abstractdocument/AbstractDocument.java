package abstractdocument;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by qincasin on 2020/3/17.
 */
public abstract class AbstractDocument implements Document {
    private ObjectMapper objectMapper = new ObjectMapper();

    private Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public Void put(String key, Object object) {
        properties.put(key, object);
        return null;
    }

    @Override
    public Object get(String key) {

        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        return Stream.ofNullable(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<String, Object>>) el)
                .findAny()
                .stream()
                .flatMap(Collection::stream)
                .map(constructor);
    }


    @SneakyThrows
    @Override
    public String toString() {
        return objectMapper.writeValueAsString(properties);
    }
}
