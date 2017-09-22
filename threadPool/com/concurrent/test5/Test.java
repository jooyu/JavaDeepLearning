package com.concurrent.test5;


import java.util.concurrent.CountDownLatch;

/**
 * 
 * 应用场景2：
假设worker的工作可以分为两个阶段，work2 只需要等待work0和work1完成他们各自工作的第一个阶段之后就可以开始自己的工作了，而不是场景1中的必须等待work0和work1把他们的工作全部完成之后才能开始。
 * @author eaves.zhu
 *
 */
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
