package com.wj.springbootreference.controller;

import com.wj.springbootreference.config.PersonProps;
import com.wj.springbootreference.config.RedisProps;
import com.wj.springbootreference.service.profile.OrderClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Resource
    private RedisProps redisProps;
    @Resource
    private PersonProps personProps;
    @Resource
    private Environment environment;
    @Resource
    private OrderClient orderClient;

    @Value("${app.name:unkown}")
    private String appName;

    @RequestMapping("/redis")
    public String configRedis() {
        return String.format("redis.host=%s redis.port=%s redis.duration=%s",
                redisProps.getHost(), redisProps.getPort(), redisProps.getTimeout());
    }

    @RequestMapping("/person")
    public String configPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append("activeProfiles = " + Arrays.toString(environment.getActiveProfiles()) +"\n");
        sb.append("appName = " + appName + "\n");
        sb.append("orderClient = " + orderClient.query("A100") + "\n");
        sb.append(personProps.getFirstName() + " ");
        personProps.getRoles().forEach(role -> sb.append(role + " "));
        personProps.getAttrs().forEach((key,value) -> sb.append(value + " "));
        return sb.toString();
    }

}
