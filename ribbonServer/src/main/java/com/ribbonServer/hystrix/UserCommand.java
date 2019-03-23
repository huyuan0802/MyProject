package com.ribbonServer.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/3/20.
 */
public class UserCommand extends HystrixCommand<Object> {
    private RestTemplate restTemplate;
    private String name;

    public UserCommand(Setter setter, RestTemplate restTemplate, String name) {
        super(setter);
        this.restTemplate = restTemplate;
        this.name = name;
    }

    @Override
    protected Object run() throws Exception {
        return restTemplate.getForObject("http://eureka-client/eurekaClient/hello?name=" + name, String.class);
    }
}
