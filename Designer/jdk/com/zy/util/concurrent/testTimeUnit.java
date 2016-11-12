package com.zy.util.concurrent;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class testTimeUnit {
/**
 * 使用 TimeUnit 将使用您的方法或 API 的开发人员从毫秒的 “暴政” 中解放出来
 * @param args
 */
	
	
public static void main(String[] args) {
	Lock lock = new ReentrantLock();
	  try {
		  //设置超时时间，50毫秒取锁超时
		if (lock.tryLock(50L, TimeUnit.MILLISECONDS)) 
		  {
			  System.out.println("hello");
		  }
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
