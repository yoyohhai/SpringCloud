package com.lam.springcloud.dao;

import com.lam.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);
}
