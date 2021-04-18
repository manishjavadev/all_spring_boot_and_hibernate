package com.manish.javadev;

public class LazySingleton {
	private static LazySingleton instance;

	// private constructor restrict developer to create instance from outside.
	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
