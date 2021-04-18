package com.manish.javadev.respository;

import org.springframework.data.repository.CrudRepository;

import com.manish.javadev.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
