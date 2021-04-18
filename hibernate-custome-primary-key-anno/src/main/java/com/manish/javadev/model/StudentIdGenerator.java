package com.manish.javadev.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.manish.javadev.util.HibernateUtil;

public class StudentIdGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor obj, Object arg) throws HibernateException {
		Transaction tx = null;
		String finalId = "";
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			Query query = session.createQuery("from Student stu");
			if (query.list().size() != 0) {
				query = session.createQuery("Select max(stu.sid) from Student stu");
				List list = query.list();
				String sid = list.get(0).toString();
				int index = sid.indexOf("-") + 1;
				String str1 = sid.substring(index, sid.length());
				System.out.println(str1);
				long id = Long.parseLong(str1);
				finalId = "MDC-" + (id + 1);
			} else {
				finalId = "MDC-" + 1000;
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalId;
	}
}
