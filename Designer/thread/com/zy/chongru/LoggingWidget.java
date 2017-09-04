package com.zy.chongru;

public class LoggingWidget extends Widget {

	public synchronized void dosomething()
	{
		//同步里面同步
		System.out.println(toString()+"111");
		super.dosomething();
		
	}
}
