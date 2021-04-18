package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.WeekdaysStudent;
import com.manish.javadev.model.WeekendStudent;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// Weekdays Student
			System.out.println("====Weekdays Student====");
			WeekdaysStudent weekdaysStudent = (WeekdaysStudent) session.load(WeekdaysStudent.class, 1);
			System.out.println("weekdaysStudent " + weekdaysStudent);

			// Weekend Student
			System.out.println("====Weekend Student====");
			WeekendStudent weekendStudent = (WeekendStudent) session.load(WeekendStudent.class, 2);
			System.out.println("weekendStudent " + weekendStudent);

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
}
