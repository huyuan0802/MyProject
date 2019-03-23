package com.feignSerice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Administrator on 2019/3/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients()
public class FeignSericeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignSericeApplication.class, args);
    }
}
