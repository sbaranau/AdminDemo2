package com.perspectix.admin;

import javax.servlet.SessionTrackingMode;

import org.eclnt.jsfserver.util.CCInitialize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AdminDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(AdminDemo2Application.class, args);
    }

    @Bean
    public ServletContextInitializer initializer()
    {
        return servletContext -> {
            Set<SessionTrackingMode> stms = new HashSet<SessionTrackingMode>();
            stms.add(SessionTrackingMode.URL);
            servletContext.setSessionTrackingModes(stms);
            CCInitialize.initializeCCEnvironment(servletContext);
        };
    }
}
