package com.manish.javadev;

public class StringDemo {
	public static void main(String[] args) {
		String str = "HUAGSM0120180913_04_00016728_MER1_52.ber";
		String local_name = getLocalName("10.196.37.188_201812042231", str);
		System.out.println("local_name = " + local_name);
	}

	private static String getLocalName(String prefix, String fileName) {
		String fileSufix = fileName.substring(fileName.indexOf("."), fileName.length());
		String finalFileName = fileName.substring(0, fileName.indexOf("."));
		finalFileName = finalFileName + "_" + prefix + fileSufix;
		return finalFileName;
	}
}
