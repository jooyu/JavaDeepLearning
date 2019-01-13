package com.yujoo.jdk.lock.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestCount {

	@Test
	public void testCount()
	{
		long start=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<=100000;i++)
		{
			sum+=i;
		
		}
		long end=System.currentTimeMillis()-start;
		System.out.println(sum+" time:"+end+"ms");
	}
}
