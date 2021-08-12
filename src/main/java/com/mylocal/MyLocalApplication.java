package com.mylocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLocalApplication {

    public static void main(String[] args) {
        System.out.println("Git");
        SpringApplication.run(MyLocalApplication.class, args);
    }

}
