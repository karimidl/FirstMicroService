package com.example.microserviceclient;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServiceClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroServiceClientApplication.class, args);
    }

}
