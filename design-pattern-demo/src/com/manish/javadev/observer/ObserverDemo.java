package com.manish.javadev.observer;

public class ObserverDemo {
	public static void main(String[] args) {
		BlogSubjectImpl blogSubjectImpl = new BlogSubjectImpl();
		UserObserver1 userObserver1 = new UserObserver1(blogSubjectImpl);
		userObserver1.setUserId(1);
		UserObserver2 userObserver2 = new UserObserver2(blogSubjectImpl);
		userObserver2.setUserId(2);
		blogSubjectImpl.setNewPost("New Post Got Added");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After 10 Sec a new post added in blog");
		blogSubjectImpl.setNewPost("New Post Got Added");
		System.out.println("Done");
	}
}
