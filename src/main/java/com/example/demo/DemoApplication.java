package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo*")
@EnableJpaRepositories("com.example.demo*")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

            var address = new Address("Poland", "Warsaw", "Kwiatowa");
            var manager = new Manager("Jakub", "Stańczak", "31983183", "34234234", address, LocalDate.of(2022, 03, 23), 5000, true, 1000);
            var department = new Department(address, manager);


    }

}
