package com.manish.javadev;

public class SynchronizedBlockSingleton {
	private static SynchronizedBlockSingleton instance;

	// private constructor restrict developer to create instance from outside.
	private SynchronizedBlockSingleton() {
	}

	public static SynchronizedBlockSingleton getInstance() {
		if (instance == null) {
			synchronized (SynchronizedBlockSingleton.class) {
				if (instance == null) {
					instance = new SynchronizedBlockSingleton();
				}
			}
		}
		return instance;
	}
}
