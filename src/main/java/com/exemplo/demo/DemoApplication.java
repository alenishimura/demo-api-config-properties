
package com.exemplo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exemplo.demo.config.ApiConfig;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ApiConfig apiConfig;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(apiConfig);
    }
}
