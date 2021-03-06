package per.jgx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.jgx.feign.EurekaClientFeign;
import per.jgx.feign.entity.UserDemo;

@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

    public UserDemo sayHello(String name, String age) {
        return eurekaClientFeign.hello(name, age);
    }

}
