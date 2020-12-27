package com.wys.springcloud.controller;

import com.wys.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id) {
        String result = paymentService.paymentOk(id);
        log.info("--> " + result + " <--");
        return result;
    }

    @GetMapping("/payment/hystrix/timeOut/{id}")
    public String paymentTimeOut(@PathVariable("id") Integer id) {
        String result = paymentService.paymentTimeOut(id);
        log.info("--> " + result + " <--");
        return result;
    }
}
