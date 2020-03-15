package com.sentinel.controller;

import com.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoyu
 * @date 2020/03/09
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return testService.sayHello(name);
    }
}
