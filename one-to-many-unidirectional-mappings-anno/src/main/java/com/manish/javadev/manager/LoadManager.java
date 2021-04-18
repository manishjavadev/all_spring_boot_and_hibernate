package com.manish.javadev.manager;

import org.hibernate.Transaction;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
}
