package com.manish.javadev;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	// private constructor restrict developer to create instance from outside.
	private StaticBlockSingleton() {
	}

	static {
		try {
			if (instance == null) {
				instance = new StaticBlockSingleton();
			}
		} catch (Exception e) {
			throw new RuntimeException("Exception occured while ceating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
