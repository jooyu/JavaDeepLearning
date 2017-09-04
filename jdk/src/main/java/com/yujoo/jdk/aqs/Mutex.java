package com.yujoo.jdk.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Mutex是一个不可重入的互斥锁实现。锁资源（AQS里的state）只有两种状态：0表示未锁定，1表示锁定
 * @author eaves.zhu
 *
 */
public class Mutex implements Lock,java.io.Serializable {
	// 自定义同步器
	private static class Sync extends AbstractQueuedSynchronizer{
		 // 判断是否锁定状态
		protected boolean isHeldExclusively(){
			return getState()==1;
			
		}
		
		// 尝试获取资源，立即返回。成功则返回true，否则false
		 public boolean tryAcquire(int acquires) {
			 assert acquires==1;//这里限定只能为1个量
			 if(compareAndSetState(0, 1)){
				 //state为0设置为1，不可重入
				 setExclusiveOwnerThread(Thread.currentThread());//设置为当前线程独占资源
				 return true;
			 }
			return false;
			 
		 }
		 // 尝试释放资源，立即返回。成功则为true，否则false。
		 protected boolean tryRelease(int releases) {
			              assert releases == 1; // 限定为1个量
			              if (getState() == 0)//既然来释放，那肯定就是已占有状态了。只是为了保险，多层判断！
			                  throw new IllegalMonitorStateException();
			              setExclusiveOwnerThread(null);
			              setState(0);//释放资源，放弃占有状态
			              return true;
			          }
	}
	// 真正同步类的实现都依赖继承于AQS的自定义同步器！
	private final Sync sync = new Sync();
	
	
	
	@Override
	public void lock() {
		 sync.acquire(1);
		
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	//tryLock<-->tryAcquire。两者语义一样：尝试获取资源，要求立即返回。成功则为true，失败则为false。
	@Override
	public boolean tryLock() {
		// TODO Auto-generated method stub
		return sync.tryAcquire(1);
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return sync.isHeldExclusively();
	}

	@Override
	public void unlock() {
		sync.release(1);
		
	}

	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
