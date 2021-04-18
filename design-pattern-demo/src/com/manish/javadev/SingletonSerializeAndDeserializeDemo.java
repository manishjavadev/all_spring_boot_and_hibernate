package com.manish.javadev;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializeAndDeserializeDemo {
	public static void main(String[] args) {
		serializeMe();
		SingletonSerialize deserializeObj = (SingletonSerialize) deSerializeMe();
		System.out.println("Deserialization Done : ");
		System.out.println("De-Serialize Object HashCode : " + deserializeObj.hashCode());
		System.out.println("De-Serialize Object : " + deserializeObj);
	}

	public static void serializeMe() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
			oos.writeObject(SingletonSerialize.getInstance());
			System.out.println("Serialize Object HashCode : " + SingletonSerialize.getInstance().hashCode());
			System.out.println("Serialize Object : " + SingletonSerialize.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object deSerializeMe() {
		ObjectInputStream oin = null;
		Object obj = null;
		try {
			oin = new ObjectInputStream(new FileInputStream("abc.txt"));
			// System.out.println("readObject called Start");
			obj = oin.readObject();
			// System.out.println("readObject called End");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj;
	}
}