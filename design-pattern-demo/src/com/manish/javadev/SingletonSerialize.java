package com.manish.javadev;

import java.io.Serializable;

public class SingletonSerialize implements Serializable {

	private static final long serialVersionUID = 1L;
	int data;
	private static SingletonSerialize instance = null;

	private SingletonSerialize() {
		System.out.println("Executing constructor");
		data = 10;
	}

	public static SingletonSerialize getInstance() {
		if (instance == null) {
			synchronized (SynchronizedBlockSingleton.class) {
				if (instance == null) {
					instance = new SingletonSerialize();
				}
			}
		}
		return instance;
	}

	public Object readResolve() {
		System.out.println("Executing readResolve");
		return SingletonSerialize.getInstance();
	}

	@Override
	public String toString() {
		return "SingletonSerialize [data=" + data + "]";
	}
	
}
