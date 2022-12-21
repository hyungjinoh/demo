package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println("=================================");
        System.out.println("This is a demo");
        System.out.println("=================================");

        System.out.println("=================================");
        System.out.println("This is a demo, 2nd");
        System.out.println("=================================");
    }

}
