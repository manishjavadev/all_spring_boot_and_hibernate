package com.manish.javadev;

public class SynchronizedMethodSingleton {
	private static SynchronizedMethodSingleton instance;

	// private constructor restrict developer to create instance from outside.
	private SynchronizedMethodSingleton() {
	}

	public static synchronized SynchronizedMethodSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedMethodSingleton();
		}
		return instance;
	}
}
