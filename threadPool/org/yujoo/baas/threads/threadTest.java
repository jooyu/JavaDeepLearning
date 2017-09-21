package org.yujoo.baas.threads;

public class threadTest {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("test  t1...");
			}
		}, "t1");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("test   t2...");

			}
		}, "t2");
		t1.start();
		t2.start();
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
