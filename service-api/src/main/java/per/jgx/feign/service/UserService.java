package per.jgx.feign.service;

import org.springframework.web.bind.annotation.*;
import per.jgx.feign.entity.UserDemo;

/**
 * @author 姜广兴
 * @date 2018-06-19
 **/
public interface UserService {
    @RequestMapping(value = "/feign-service/servicePost", method = RequestMethod.POST)
    String helloService(@RequestBody UserDemo userDemo);

    @RequestMapping(value = "/hello/{name}/{age}")
    UserDemo hello(@PathVariable("name") String name, @PathVariable("age") String age);
}
