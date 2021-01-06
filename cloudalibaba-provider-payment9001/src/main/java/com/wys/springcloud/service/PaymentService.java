package com.wys.springcloud.service;

import com.wys.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int add(Payment payment);

    public Payment selectById(@Param("id") Long id);
}
