package com.wj.springbootreference.service;

import org.springframework.boot.BootstrapContextClosedEvent;
import org.springframework.context.ApplicationListener;

public class MyEarlyService implements ApplicationListener<BootstrapContextClosedEvent> {

    public void initialize() {
        System.out.println("myEarlyService initialize");
    }

    @Override
    public void onApplicationEvent(BootstrapContextClosedEvent event) {
        System.out.println("myEarlyService onApplicationEvent");
    }
}
