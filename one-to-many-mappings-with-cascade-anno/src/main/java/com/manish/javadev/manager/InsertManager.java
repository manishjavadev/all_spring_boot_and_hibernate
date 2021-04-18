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

			Customer customer = new Customer("Vaishali", "Dureja", 25);

			Set<Order> orderList = new HashSet<Order>();
			Order order1 = new Order("OnePlus Mobile", new Date());
			Order order2 = new Order("OnePlus Cover", new Date());
			orderList.add(order1);
			orderList.add(order2);
			order1.setCustomer(customer);
			order2.setCustomer(customer);

			customer.setOrder(orderList);

			// Save Customer
			session.save(customer);

			// Save Order
			/*session.save(order1);
			session.save(order2);*/

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