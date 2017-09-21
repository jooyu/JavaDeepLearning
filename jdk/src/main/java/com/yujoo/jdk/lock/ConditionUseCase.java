package com.yujoo.jdk.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionUseCase {
public static void main(String[] args) throws InterruptedException {
	
	new ConditionUseCase().conditionWait();
	
}
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	


public void conditionWait() throws InterruptedException {
	lock.lock();
	try {
	//Condition定义了等待/通知两种类型的方法
		
	condition.await();
	} finally {
	lock.unlock();
	}
	}
	public void conditionSignal() throws InterruptedException {
	lock.lock();
	try {
	condition.signal();
	} finally {
	lock.unlock();
	}
	}
}
