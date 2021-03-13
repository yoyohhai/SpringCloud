package com.lam.springcloud.service;

import com.lam.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);
}
