package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.util.HibernateUtil;

public class SelectFirstname {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Query query = session.getNamedQuery("FIND_ALL_STUDENT_FIRST_NAME");
			List<String> studentFirstNameList = (List<String>) query.list();
			System.out.println("List size : " + studentFirstNameList.size());
			for (String firstName : studentFirstNameList) {
				System.out.println("Student Info : " + firstName);
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
