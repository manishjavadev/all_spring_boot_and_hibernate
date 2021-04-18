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
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = (Student) session.load(Student.class, 1);

			for (String string : stu.getCource()) {
				System.out.println("courses " + string);
			}

			System.out.println(stu.getEmail());// List
			System.out.println(stu.getPhoneNumber());// Set
			System.out.println(stu.getCourseAndTeacher());// Map

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
