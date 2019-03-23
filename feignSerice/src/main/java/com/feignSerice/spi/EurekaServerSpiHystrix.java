package com.feignSerice.spi;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/3/20.
 */
@Component
public class EurekaServerSpiHystrix implements EurekaServerSpi{
    @Override
    public String hello(String name) {
        return "EurekaServerSpi 服务不通，请过段时间再试";
    }
}
