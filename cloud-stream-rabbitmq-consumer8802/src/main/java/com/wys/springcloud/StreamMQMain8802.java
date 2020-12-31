package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/30 11:25
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8802 {

    public static void main(String[] args){
        SpringApplication.run(StreamMQMain8802.class,args);
    }
}
