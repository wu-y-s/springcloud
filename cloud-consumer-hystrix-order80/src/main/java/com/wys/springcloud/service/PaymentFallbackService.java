package com.wys.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/26 21:08
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentOk(Integer id) {
        return null;
    }

    @Override
    public String paymentTimeOut(Integer id) {
        return null;
    }
}
