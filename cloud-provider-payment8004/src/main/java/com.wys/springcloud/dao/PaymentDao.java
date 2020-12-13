package com.wys.springcloud.dao;

import com.wys.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int add(Payment payment);

    public Payment selectById(@Param("id") Long id);
}
