package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class SelectAllRecord {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			String sqlQery = "Select * from TBL_STUDENT stu";

			String hqlQery = "from Student stu";
			Query query = session.createQuery(hqlQery);
			List<Student> studentList = (List<Student>) query.list();
			System.out.println("List size : " + studentList.size());
			for (Student student : studentList) {
				System.out.println("Student Info : " + student);
			}

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
