package com.wys.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wys.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentOk(id);
    }

    @GetMapping("/payment/hystrix/timeOut/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentTimeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentTimeOut(id);
    }

    public String paymentTimeOutHandler(Integer id){
        return "消费者paymentTimeOutHandler: "+Thread.currentThread().getName()+"<--timeOut-->"+id;
    }

    public String paymentGlobalFallbackMethod(){
        return "全局";
    }
}
