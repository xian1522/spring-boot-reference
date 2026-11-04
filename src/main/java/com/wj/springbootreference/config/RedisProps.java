package com.wj.springbootreference.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
@Validated
@ConfigurationProperties("app.redis")
public class RedisProps {
    private String host;
    private String port;
    private Duration timeout;

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setTimeout(@DefaultValue("3s") Duration timeout) {
        this.timeout = timeout;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public Duration getTimeout() {
        return timeout;
    }
}
