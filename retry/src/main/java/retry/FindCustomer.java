package retry;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Created by qincasin on 2020/3/19.
 */
public final class FindCustomer implements BusinessOperation<String> {
    private String customId;
    private final Deque<BusinessException> errors;

    public FindCustomer(String customId, BusinessException... errors) {
        this.customId = customId;
        this.errors = new ArrayDeque(List.of(errors));
    }

    @Override
    public String perform() throws BusinessException {
        if (!errors.isEmpty()) {
            throw errors.pop();
        }
        return customId;
    }
}
