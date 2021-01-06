package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2021/1/6 9:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

    public static void main(String[] args){
        SpringApplication.run(PaymentMain9002.class,args);
    }
}
