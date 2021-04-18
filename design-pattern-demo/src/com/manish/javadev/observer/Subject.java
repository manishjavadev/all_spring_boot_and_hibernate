package com.manish.javadev.observer;

public interface Subject {
	// register observers
	public void register(Observer obj);

	// unregister observers
	public void unregister(Observer obj);

	// notify observers of change
	public void notifyObservers();

	// get updates from subject
	public String getNewPost();
}
