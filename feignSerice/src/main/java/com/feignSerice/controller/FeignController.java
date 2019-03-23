package com.feignSerice.controller;

import com.feignSerice.spi.EurekaServerSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/17.
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    EurekaServerSpi eurekaServerSpi;

    @GetMapping(value = "/getEurekaServerHello")
    public String getEurekaServerHello(@RequestParam(value = "name") String name) {
        return eurekaServerSpi.hello(name);
    }
}
