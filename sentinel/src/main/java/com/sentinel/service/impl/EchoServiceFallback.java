package com.sentinel.service.impl;

import com.sentinel.service.EchoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lixiaoyu
 * @date 2020/03/11
 */
@Service
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }
}
