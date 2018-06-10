package per.jgx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import per.jgx.conf.FeignConfig;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam("name") String name);
}
