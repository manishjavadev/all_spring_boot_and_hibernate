package com.manish.javadev.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.javadev.dao.AccountRepository;
import com.manish.javadev.model.AccountEntity;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public AccountEntity save(AccountEntity accountEntity) {
		AccountEntity acccountResult = accountRepository.save(accountEntity);
		return acccountResult;
	}

	@Override
	public AccountEntity find(Long accountNumber) {
		// TODO Auto-generated method stub
		Optional<AccountEntity> accounts = accountRepository.findById(accountNumber);
		if (accounts.isPresent()) {
			return accounts.get();
		} else {
			return null;
		}
	}

	@Override
	public AccountEntity update(AccountEntity accountEntity) {
		return accountRepository.save(accountEntity);
	}

	@Override
	public void delete(Long accountNumber) {
		Optional<AccountEntity> accounts = accountRepository.findById(accountNumber);
		if (accounts.isPresent()) {
			accountRepository.delete(accounts.get());
		}
	}
}
