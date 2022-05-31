package com.takeaway.referee;

import com.takeaway.referee.configuration.DestinationsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DestinationsConfig.class)
public class RefereeApp {

    public static void main(String[] args) {
        SpringApplication.run(RefereeApp.class, args);
    }
}
