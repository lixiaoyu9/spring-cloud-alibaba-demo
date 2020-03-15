package com.sentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sentinel.service.EchoService;
import com.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lixiaoyu
 * @date 2020/03/09
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private EchoService echoService;

    @SentinelResource(value = "sayHello", fallback = "fallbackService")
    @Override
    public String sayHello(String name) {
        return "Hello: " + name;
    }

    public String fallbackService(String name) {
        return "Hello，java";
    }
}
