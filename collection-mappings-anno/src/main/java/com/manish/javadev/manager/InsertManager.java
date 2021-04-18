package com.manish.javadev.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			List<String> emailList = new ArrayList<String>();
			emailList.add("manish1@javadev.com");
			emailList.add("manish2@javadev.com");
			emailList.add("manish3@javadev.com");

			String course[] = { "Spring-Rest", "Spring-Data", "Spring-Boot" };

			Set<Long> phones = new HashSet<Long>();
			phones.add(new Long(1111));
			phones.add(new Long(2222));
			phones.add(new Long(3333));
			phones.add(new Long(4444));

			HashMap<String, String> courseAndTeacher = new HashMap<String, String>();
			courseAndTeacher.put("Spring-Rest", "RAMYA");
			courseAndTeacher.put("Spring-Data", "MANISH");
			courseAndTeacher.put("Spring-Boot", "MANISH");

			Student stu = new Student("Vaishali", "B-Tech", "12-05-1990", emailList, course, phones, courseAndTeacher);
			session.save(stu);
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