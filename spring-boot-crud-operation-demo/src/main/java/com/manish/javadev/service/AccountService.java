package com.manish.javadev.service;

import com.manish.javadev.model.AccountEntity;

public interface AccountService {

	AccountEntity save(AccountEntity accountEntity);

	AccountEntity find(Long accountNumber);

	AccountEntity update(AccountEntity accountEntity);

	void delete(Long accountId);

}