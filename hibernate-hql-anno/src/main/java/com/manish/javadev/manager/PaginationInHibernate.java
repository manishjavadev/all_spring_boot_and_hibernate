package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class PaginationInHibernate {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			int startRow = 0;
			String hqlQery = "from Student stu";
			Query query = session.createQuery(hqlQery);

			/*
			 * setFirstResult: setFirstResult represent first row to retrieve,
			 * if setFirstResult is 0 then row start from 1, if setFirstResult
			 * is 1 then row start from 2, if setFirstResult is 2 then row start
			 * from 3 etc..
			 * 
			 * If not set, rows will be retrieved beginning from row 0.
			 * 
			 * setMaxResults: setMaxResults represent number of row to retrieve
			 * in each execution, if max result is not available then available
			 * record will be displayed.
			 * 
			 * ex: suppose setMaxResults 3, result set contains only 2 record
			 * then only 2 record will be displayed.
			 * 
			 * If not set, there is no limit to the number of rows retrieved.
			 */
			query.setFirstResult(startRow);
			query.setMaxResults(3);

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
