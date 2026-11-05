package com.wj.springbootreference.service.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod")
public class MockOrderClient implements OrderClient{
    @Override
    public String query(String orderId) {
        return "Mock[orderId] = " + orderId;
    }
}
