package com.vkutsenko.awsSync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application class.
 */
@EnableAutoConfiguration
@ComponentScan
public class AwsSyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(AwsSyncApplication.class, args);
    }
}
