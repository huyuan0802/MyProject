package com.feignSerice.spi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/3/17.
 */
@FeignClient(value = "eureka-client",path = "/eurekaClient",fallback = EurekaServerSpiHystrix.class)
public interface EurekaServerSpi {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name);
}
