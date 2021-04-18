package com.manish.javadev;

public class Thread1 extends Thread {
	PrintEvenOdd shared;

	public Thread1(PrintEvenOdd shared) {
		this.shared = shared;

	}

	public void run() {
		int index = 0;
		try {
			while (index < 50) {
				shared.printOdd();
				index++;
			}
			shared.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
