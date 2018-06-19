package per.jgx.feign.hystrix;

import org.springframework.stereotype.Component;
import per.jgx.feign.EurekaClientFeign;
import per.jgx.feign.entity.UserDemo;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return name + "err";
    }

    @Override
    public String helloService(UserDemo userDemo) {
        return "err";
    }

    @Override
    public UserDemo hello(String name, String age) {
        return null;
    }
}
