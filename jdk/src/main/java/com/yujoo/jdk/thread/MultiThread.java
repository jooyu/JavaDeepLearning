package com.yujoo.jdk.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
[5] Attach Listener 
[4] Signal Dispatcher  分发处理发送给JVM信号的线程
[3] Finalizer  调用对象finalize方法的线程
[2] Reference Handler  清楚reference的线程
[1] main  main线程，用户程序入口
 * 
 * 
 * 
 * @author eaves.zhu
 *
 */

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取java线程管理的bean
		ThreadMXBean threadMXBean=ManagementFactory.getThreadMXBean();
		ThreadInfo[] threadInfos=threadMXBean.dumpAllThreads(false, false);
		//遍历线程信息，打印线程ID和线程名称
		for (ThreadInfo threadInfo : threadInfos) {
			System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.
					getThreadName());

		}
	}

}
