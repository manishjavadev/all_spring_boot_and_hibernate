package com.kopal.finalyear.project;

import com.kopal.finalyear.project.model.TransactionRequest;
import com.kopal.finalyear.project.model.TransactionResponse;

public interface OrderService {
	TransactionResponse saveOrder(TransactionRequest transactionrequest);

	String getData();

}
