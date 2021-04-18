package com.kopal.finalyear.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kopal.finalyear.project.model.OrderEntity;

@Repository
public interface OrderRepo extends CrudRepository<OrderEntity, Integer> {

}
