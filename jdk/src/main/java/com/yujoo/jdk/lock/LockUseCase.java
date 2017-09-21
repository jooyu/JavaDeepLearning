package com.yujoo.jdk.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUseCase {

	
	public static void main(String[] args) {
		
		Lock lockA=new ReentrantLock();
		Lock lockB=new ReentrantLock();
		Lock lockC=new ReentrantLock();
		lockA.lock();
		System.out.println("A lock");
		try {
			//A 获取 B
			lockB.lock();
			System.out.println("B lock");
			lockC.lock();
			System.out.println("C lock");
			lockB.unlock();
			System.out.println("B unlock");
			lockC.unlock();
			System.out.println("C unlock");
		} finally {
			lockA.unlock();
			System.out.println("A unlock");
		}
		
	}
}
