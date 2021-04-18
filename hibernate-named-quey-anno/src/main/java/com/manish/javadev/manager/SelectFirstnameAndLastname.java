package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.util.HibernateUtil;

public class SelectFirstnameAndLastname {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Query query = session.getNamedQuery("FIND_FIRST_NAME_AND_LAST_NAME");
			List<Object[]> studentFirstAndLastNameList = (List<Object[]>) query.list();
			System.out.println("List size : " + studentFirstAndLastNameList.size());
			for (Object[] firstAndLastName : studentFirstAndLastNameList) {
				System.out.println("First Name : " + firstAndLastName[0] + ", Last Name : " + firstAndLastName[1]);
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
