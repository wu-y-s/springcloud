package com.wys.springcloud.controller;

import com.wys.springcloud.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2021/1/6 9:41
 **/
@RestController
@Slf4j
public class NacosController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;


    @GetMapping(value = "/consumer/selectById/{id}")
    public CommonResult selectById(@PathVariable("id") Long id){
        return restTemplate.getForObject(serviceUrl+"/payment/selectById/"+id,CommonResult.class);
    }


    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String nacos(@PathVariable("id") Long id){
        return restTemplate.getForObject(serviceUrl+"/payment/nacos/"+id,String.class);
    }

}
