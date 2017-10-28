package it.ts.dotcom.example.client.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientWEBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientWEBApplication.class, args);
    }
}
