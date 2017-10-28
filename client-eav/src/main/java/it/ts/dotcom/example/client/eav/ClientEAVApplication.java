package it.ts.dotcom.example.client.eav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientEAVApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientEAVApplication.class, args);
    }
}
