package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2021/1/4 17:10
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8803 {
    public static void main(String[] args){
        SpringApplication.run(StreamMQMain8803.class,args);
    }
}
