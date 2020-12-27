package com.wys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/27 20:28
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain {

    public static void main(String[] args){
        SpringApplication.run(HystrixDashboardMain.class,args);

    }
}
