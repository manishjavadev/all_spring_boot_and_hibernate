package com.manish.javadev;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	// private constructor restrict developer to create instance from outside.
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
