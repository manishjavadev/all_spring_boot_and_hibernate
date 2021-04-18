package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class DataNindingWithMoreThanOneNamedPlaceholder {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			String hqlQery = "from Student stu WHERE stu.sid=:studentId and stu.firstName=:studentFirstName";
			Query query = session.createQuery(hqlQery);
			query.setInteger("studentId", 1);
			query.setString("studentFirstName", "Vaishali");
			List<Student> studentData = (List<Student>) query.list();
			System.out.println("List size : " + studentData.size());
			for (Student student : studentData) {
				System.out.println("student Info :" + student);
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
