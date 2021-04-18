package com.manish.javadev.observer;

public class UserObserver2 implements Observer {
	private Subject subject;
	private long userId;

	public UserObserver2(Subject subject) {
		this.subject = subject;
		subject.register(this);
	}

	@Override
	public void update() {
		System.out.println("Updating User " + userId + " for new post: ");
		subject.getNewPost();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserObserver2 other = (UserObserver2) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

}
