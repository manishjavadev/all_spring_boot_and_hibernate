package com.manish.javadev.manager;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Account;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class, 1);

			System.out.println("Account Info : " + customer);

			Set<Account> accountList = customer.getAccount();
			for (Account account : accountList) {
				System.out.println("Account Info : " + account);
			}

			tx.commit();
			session.flush();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
}
