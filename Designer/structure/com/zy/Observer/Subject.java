package com.zy.Observer;


/**
 * 
 * 基于Subject被观察者的需求，这个是实现一个基本的Subject接口，此接口定了一系列具体的方法需要在随后实现接口的具体类中被实现
 * @author eaves.zhu
 *
 */
public interface Subject {

	//methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);

	//method to notify observers of change
	public void notifyObservers();

	//method to get updates from subject
	public Object getUpdate(Observer obj);

}