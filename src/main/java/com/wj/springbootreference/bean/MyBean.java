package com.wj.springbootreference.bean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public MyBean(ApplicationArguments args) {
        for (String arg : args.getSourceArgs()){
            System.out.println(arg);
        }
    }
}
