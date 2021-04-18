package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.WeekdaysStudent;
import com.manish.javadev.model.WeekendStudent;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// 1 Adding Weekday Student
			WeekdaysStudent weekdaysStudent = new WeekdaysStudent("Vaishali", "BLR", "B-Tech", "72%", "8.30AM",
					"BTM-Branch");

			// 2 Adding Weekend Student
			WeekendStudent weekendStudent = new WeekendStudent("Ramya", "BLR", "Oracle", "ramya@gmail.com", "4PM",
					"BTM-Branch");

			session.save(weekdaysStudent);
			session.save(weekendStudent);

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