package com.yujoo.jdk.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;



public class Cache {
	static Map<String, Object> map = new HashMap<String, Object>();
	static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	static Lock r = rwl.readLock();
	static Lock w = rwl.writeLock();
	public static final Object get(String key){
		
		r.lock();
		try {
			return map.get(key);
		} finally {
			// TODO: handle finally clause
			r.unlock();
		}
		
		
	}
	public static final Object put(String key ,Object value)
	{
		
		w.lock();
		try {
			return map.put(key, value);
		} finally {
			// TODO: handle finally clause
		w.unlock();
		}
	}
	
	
	public static final void clear(){
		//这里为什么不用读锁？写锁>读锁
		w.lock();
		try {
			map.clear();
		} finally {
			// TODO: handle finally clause
		w.unlock();
		}
		
	}
}
