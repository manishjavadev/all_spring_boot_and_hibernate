package com.manish.javadev.respository;

import org.springframework.data.repository.CrudRepository;

import com.manish.javadev.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
