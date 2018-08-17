package com.internship.bluebirdregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BluebirdRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BluebirdRegistryApplication.class, args);
    }
}
