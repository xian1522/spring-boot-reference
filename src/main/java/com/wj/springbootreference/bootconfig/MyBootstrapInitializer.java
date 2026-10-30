package com.wj.springbootreference.bootconfig;

import com.wj.springbootreference.service.MyEarlyService;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;

public class MyBootstrapInitializer implements BootstrapRegistryInitializer {
    @Override
    public void initialize(BootstrapRegistry registry) {
//        registry.register(MyEarlyService.class, context -> {
//            return new MyEarlyService();
//        });
        registry.addCloseListener(new MyEarlyService());
    }
}
