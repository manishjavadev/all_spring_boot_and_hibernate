package com.kopal.finalyear.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kopal.finalyear.project.model.PaymentEntity;

@Repository
public interface PaymentRepo extends CrudRepository<PaymentEntity, Integer> {

}
