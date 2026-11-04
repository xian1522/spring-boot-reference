package com.wj.springbootreference.service;

import com.wj.springbootreference.config.PersonProps;
import com.wj.springbootreference.config.RedisProps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/config")
public class ServiceController {
    @Resource
    private RedisProps redisProps;
    @Resource
    private PersonProps personProps;


    @RequestMapping("/redis")
    public String configRedis() {
        return String.format("redis.host=%s redis.port=%s redis.duration=%s",
                redisProps.getHost(), redisProps.getPort(), redisProps.getTimeout());
    }

    @RequestMapping("/person")
    public String configPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append(personProps.getFirstName() + " ");
        personProps.getRoles().forEach(role -> sb.append(role + " "));
        personProps.getAttrs().forEach((key,value) -> sb.append(value + " "));
        return sb.toString();
    }

}
