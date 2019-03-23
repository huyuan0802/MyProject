package com.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/17.
 */
@RestController
@RequestMapping("/eurekaClient")
public class HelloController {
    @Value("${server.port}")
    String port;

    /**
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi --" + name + " ,i am from port:" + port;
    }
}
