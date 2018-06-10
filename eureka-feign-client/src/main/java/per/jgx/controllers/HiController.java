package per.jgx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import per.jgx.service.HiService;

@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "test", required = false) String name) {
        return hiService.sayHi(name);
    }

}
