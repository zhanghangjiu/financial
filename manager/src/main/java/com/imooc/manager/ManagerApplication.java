package com.imooc.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.imooc.entity")
public class ManagerApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class);
    }
}
