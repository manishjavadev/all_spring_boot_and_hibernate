package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// Student 1
			Student stu = new Student("Vaishali", "Dureja", "B-Tech", "12-05-1990");
			session.save(stu);

			// Student 2
			stu = new Student("Ramya", "KA", "B-Tech", "12-05-1989");
			session.save(stu);

			// Student 3
			stu = new Student("Manish", "Srivastava", "MCA", "12-05-1987");
			session.save(stu);

			// Student 4
			stu = new Student("Abhishek", "Kumar", "B-Tech", "12-05-1989");
			session.save(stu);

			tx.commit();
			session.close();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}