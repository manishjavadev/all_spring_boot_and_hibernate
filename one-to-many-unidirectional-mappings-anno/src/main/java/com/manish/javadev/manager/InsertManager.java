package com.manish.javadev.manager;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.model.Order;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Set<Order> orderList = new HashSet<Order>();
			Order oder1 = new Order("Moto Note 4", new Date());
			Order oder2 = new Order("Moto Note Cover", new Date());
			orderList.add(oder1);
			orderList.add(oder2);

			Customer customer = new Customer("Vaishali", "Dureja", 25);
			customer.setOrder(orderList);

			session.save(customer);

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