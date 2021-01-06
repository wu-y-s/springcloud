package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2021/1/5 16:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {

    public static void main(String[] args){
        SpringApplication.run(PaymentMain9001.class,args);
    }
}
