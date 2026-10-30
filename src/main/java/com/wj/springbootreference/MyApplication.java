package com.wj.springbootreference;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApplication {

    @RequestMapping("/")
    public String home() {
        return "hello world";
    }
}
