package com.ribbonServer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ribbonServer.hystrix.UserCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/3/20.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/eurekaClient/hello?name="+name,String.class);
    }
    public String error(String name) {
        return "hi,"+name+",sorry,error!服务连接不通";
    }
}
