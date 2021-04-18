package com.manish.javadev.observer;

import java.util.HashSet;
import java.util.Set;

public class BlogSubjectImpl implements Subject {
	private Set<Observer> listObserver = null;
	private String newPost = null;

	@Override
	public void register(Observer obj) {
		if (listObserver == null) {
			listObserver = new HashSet<>();
		}
		listObserver.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		listObserver.remove(obj);
	}

	@Override
	public void notifyObservers() {
		listObserver.forEach(observer -> observer.update());
	}

	@Override
	public String getNewPost() {
		return newPost;
	}

	public void setNewPost(String newPost) {
		this.newPost = newPost;
		notifyObservers();
	}
}
