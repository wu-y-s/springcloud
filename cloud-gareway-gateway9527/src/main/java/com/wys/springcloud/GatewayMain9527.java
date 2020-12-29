package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/29 9:42
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {

    public static void main(String[] args){
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
