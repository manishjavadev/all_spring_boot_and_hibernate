package com.manish.javadev.manager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.util.HibernateUtil;

public class DeleteRecord {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			String hqlQery = "Delete from Student stu WHERE stu.sid=:studentId";
			Query query = session.createQuery(hqlQery);
			query.setInteger("studentId", 1);

			int result = query.executeUpdate();

			System.out.println("Number of Effected Row  :" + result);

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
