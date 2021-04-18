package com.manish.javadev.manager;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.model.Account;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Set<Account> accountList1 = new HashSet<Account>();
			Account account1 = new Account("Joint Account", new Date());
			Account account2 = new Account("Personal Account", new Date());
			accountList1.add(account1);
			accountList1.add(account2);

			Customer customer1 = new Customer("Deeksha", "Nagraj", 23);
			customer1.setAccount(accountList1);

			Set<Account> accountList2 = new HashSet<Account>();
			accountList2.add(account2);
			Customer customer2 = new Customer("Anusha", "Pai", 23);
			customer2.setAccount(accountList2);

			session.save(customer1);
			session.save(customer2);

			tx.commit();
			session.flush();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}