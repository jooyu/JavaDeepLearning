package org.yujoo.baas.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
		ExecutorService ex1=Executors.newCachedThreadPool();
		
		ExecutorService ex2=Executors.newSingleThreadExecutor();
		
		ExecutorService ex3=Executors.newFixedThreadPool(10);
	}

}
