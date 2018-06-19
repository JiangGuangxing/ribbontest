package per.jgx.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import per.jgx.conf.FeignConfig;
import per.jgx.feign.hystrix.HiHystrix;
import per.jgx.feign.service.UserService;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign extends UserService {
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam("name") String name);
}
