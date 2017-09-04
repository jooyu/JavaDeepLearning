package com.zy.chongru;

public class Widget {
//同步代码块，线程进入获得锁
public synchronized void dosomething()
{
	System.out.println("hello");
}
}
