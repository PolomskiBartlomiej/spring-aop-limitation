package spring.aoplimitation.limitation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.aoplimitation.aop.AddParam;

@Component
@Primary
class ParamHandler {

    @AddParam
    String handle(String param) {
        return param;
    }

    @AddParam
    String handle3(String param) {
        return handle(param);
    }

    String handle2(String param) {
        return handle(param);
    }
}
