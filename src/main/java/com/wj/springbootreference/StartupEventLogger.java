package com.wj.springbootreference;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupEventLogger {

    private final long start = System.currentTimeMillis();

    @EventListener
    public void onWebServer(WebServerInitializedEvent event) {
        log("WebServerInitialized, port=" + event.getWebServer().getPort());
    }

    @EventListener
    public void onRefreshed(ContextRefreshedEvent event) {
        log("context refreshed ");
    }
    @EventListener
    public void onStarted(ApplicationStartedEvent event) {
        log("application started");
    }
    @EventListener
    public void onReady(ApplicationReadyEvent event) {
        log("application ready");
    }
    @EventListener
    public void onReadiness(AvailabilityChangeEvent<ReadinessState> event) {
        log("application state=" + event.getState());
    }

    @EventListener
    public void onLiveness(AvailabilityChangeEvent<LivenessState> e) {
        log("Liveness=" + e.getState());
    }

    private void log(String msg) {
        System.out.println("[EVENT] + " + (System.currentTimeMillis() - start) + " ms " + msg);
    }
}
