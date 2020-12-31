package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/30 10:42
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801 {

    public static void main(String[] args){
        SpringApplication.run(StreamMQMain8801.class,args);
    }
}
