package com.yujoo.jdk.lock.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		final Map<String, String> test=new ConcurrentHashMap<>();
		final Map<String, Integer> count = new ConcurrentHashMap<>();  
	    final CountDownLatch endLatch = new CountDownLatch(2);  
	    Runnable task = new Runnable() {  
	        @Override  
	        public void run() {  
	            for (int i = 0; i < 5; i++) {  
	                Integer value = count.get("a");  
	                if (null == value) {  
	                    count.put("a", 1);  
	                } else {  
	                    count.put("a", value + 1);  
	                }  
	            }  
	            endLatch.countDown();  
	        }
	    };
	    new Thread(task).start();  
	    new Thread(task).start();  
	  
	    try {  
	        endLatch.await();  
	        System.out.println(count);  
	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }  
		
	}
	 

}
