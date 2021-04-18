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
			Student student = (Student) session.load(Student.class, 1);

			System.out.println("Student  : " + student);
			student.setDob("12-05-1994");
			session.update(student);

			Student updatedStudent = (Student) session.load(Student.class, 1);

			System.out.println("Updated Student  : " + updatedStudent);

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
