package it.ts.dotcom.example.client.acl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientACLApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientACLApplication.class, args);
    }
}
