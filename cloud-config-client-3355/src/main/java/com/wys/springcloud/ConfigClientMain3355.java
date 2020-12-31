package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/29 15:37
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}
