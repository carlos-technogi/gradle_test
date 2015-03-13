package com.amedet.api;

import com.amedet.api.services.SomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class AmedetApiApplication implements CommandLineRunner{

    private Logger logger = LoggerFactory.getLogger(AmedetApiApplication.class);
    @Autowired
    private SomeService someService;

    public static void main(String[] args) {
        SpringApplication.run(AmedetApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String foo = someService.foo();
        logger.info("SomeService returned {}", foo);
    }
}
