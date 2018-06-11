package per.jgx.feign.hystrix;

import org.springframework.stereotype.Component;
import per.jgx.feign.EurekaClientFeign;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return name + "err";
    }
}
