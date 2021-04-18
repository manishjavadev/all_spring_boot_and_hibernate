package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.AdharDetail;
import com.manish.javadev.model.UserDetail;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			UserDetail userDetail = new UserDetail("Vaishali", "Dureja", 25);
			AdharDetail adharDetail = new AdharDetail("BLR", "KARNATKA", "ADH-100111");

			userDetail.setAdharDetail(adharDetail);
			adharDetail.setUserDetail(userDetail);
			session.save(userDetail);

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