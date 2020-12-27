package com.wys.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentOk(Integer id){

        return Thread.currentThread().getName()+"<--ok-->"+id;
    }

    @HystrixCommand(fallbackMethod = "paymentTimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentTimeOut(Integer id){
        //int a= 5/0;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "paymentTimeOut: "+Thread.currentThread().getName()+"<--timeOut-->"+id;
    }

    public String paymentTimeOutHandler(Integer id){
        return "paymentTimeOutHandler: "+Thread.currentThread().getName()+"<--timeOut-->"+id;
    }
}
