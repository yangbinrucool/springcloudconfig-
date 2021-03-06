package com.example.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class EurekaproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaproviderApplication.class, args);
    }
}
