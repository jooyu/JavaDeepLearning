package com.concurrent.test4;

import java.util.concurrent.CountDownLatch;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根

		CountDownLatch countDownLatch = new CountDownLatch(2);
		Worker worker0 = new Worker("worker0", (long) (Math.random()*2000+3000), countDownLatch);
		Worker worker1 = new Worker("worker1", (long) (Math.random()*2000+3000), countDownLatch);
		Worker worker2 = new Worker("worker2", (long) (Math.random()*2000+3000), countDownLatch);
		
		worker0.start();
		worker1.start();
		
		countDownLatch.await();
		System.out.println("准备工作就绪");
		worker2.start();		
	}
}
