package com.concurrent.test3;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根

		Worker worker0 = new Worker("worker0", (long) (Math.random()*2000+3000));
		Worker worker1 = new Worker("worker1", (long) (Math.random()*2000+3000));
		Worker worker2 = new Worker("worker2", (long) (Math.random()*2000+3000));
		
		worker0.start();
		worker1.start();
//		Thread.sleep(1000);
		worker0.join();
		worker1.join();
		System.out.println("准备工作就绪");
		
		worker2.start();
	
	}
}
