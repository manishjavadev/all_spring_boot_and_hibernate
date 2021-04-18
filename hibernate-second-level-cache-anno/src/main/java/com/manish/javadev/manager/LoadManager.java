package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session1 = sf.openSession();
			tx = session1.beginTransaction();
			Student student1 = (Student) session1.load(Student.class, 1);
			System.out.println("Student  :" + student1);
			session1.close();
			try {
				Thread.sleep(5000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Session session2 = sf.openSession();
			Student student2 = (Student) session2.load(Student.class, 1);
			System.out.println("Student  :" + student2);
			session2.close();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
