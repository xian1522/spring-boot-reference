package com.wj.springbootreference;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class SpringBootReferenceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .sources(SpringBootReferenceApplication.class)
//                .logStartupInfo(false)
                .bannerMode(Banner.Mode.CONSOLE).run(args);

    }

}
