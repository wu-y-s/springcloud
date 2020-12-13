package com.wys.springcloud.controller;

import com.wys.springcloud.entity.CommonResult;
import com.wys.springcloud.entity.Payment;
import com.wys.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment){
        int result = paymentService.add(payment);
        log.info("插入结果："+result);
        if(result > 0){
            return new CommonResult(200,"插入成功！"+serverPort,result);
        }
        else{
            return new CommonResult(444,"插入失败！");
        }
    }

    @GetMapping(value = "/payment/selectById/{id}")
    public CommonResult selectById(@PathVariable("id") Long id){
        Payment payment = paymentService.selectById(id);
        log.info("查询结果："+payment);
        if(null != payment){
            return new CommonResult(200,"查询成功！"+serverPort,payment);
        }
        else{
            return new CommonResult(444,"查询失败！");
        }
    }


}
