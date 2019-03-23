package com.hystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Administrator on 2019/3/20.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixDashboardAppilcaiton {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardAppilcaiton.class, args);
    }
}
