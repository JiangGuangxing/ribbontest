package per.jgx.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import per.jgx.feign.entity.UserDemo;
import per.jgx.feign.service.UserService;

@RestController
public class HiController implements UserService {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port: " + port;
    }

    @Override
    public String helloService(@RequestBody UserDemo userDemo) {
        return "success";
    }

    @Override
    public UserDemo hello(@PathVariable("name") String name, @PathVariable("age") String age) {
        return new UserDemo(name, age);
    }

    @GetMapping("/hihi/{name}")
    public String hihi(@PathVariable String name) {
        return "hihi " + name + ", i am from port: " + port;
    }

}
