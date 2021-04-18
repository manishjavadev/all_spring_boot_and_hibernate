package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.model.StudentId;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// For composite key, to fetch data from database
			StudentId studentId = new StudentId(new Long(101), "B-Tech", "BLR");
			Student student = (Student) session.load(Student.class, studentId);
			StudentId studentId2 = student.getStudentId();
			System.out.println(studentId2);
			System.out.println(student);

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