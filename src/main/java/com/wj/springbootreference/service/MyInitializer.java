package com.wj.springbootreference.service;

import org.springframework.boot.BootstrapContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        BootstrapContext bootstrapContext = applicationContext.getBean(BootstrapContext.class);
        MyEarlyService myEarlyService = bootstrapContext.get(MyEarlyService.class);
        myEarlyService.initialize();
    }
}
