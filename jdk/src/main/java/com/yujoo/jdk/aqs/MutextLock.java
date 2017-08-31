package com.yujoo.jdk.aqs;


	import java.util.concurrent.TimeUnit;
	import java.util.concurrent.locks.AbstractQueuedSynchronizer;
	import java.util.concurrent.locks.Condition;
	import java.util.concurrent.locks.Lock;

	/**
	 * 独占锁 使用AQS实现
	 * AQS定义了一套多线程访问共享资源的同步器框架
	 * 框架维护了一个volatile int state（代表共享资源）和一个FIFO线程等待队列（多线程争用资源被阻塞时会进入此队列）
	 * AQS定义了两种资源方式：Exclusive（独占，只有一个线程能执行，如ReentrantLock）和Share（共享，多个线程可同时执行，如Semaphore/CountDownLatch）
	 * @author YU JOO
	 *
	 */
	public class MutextLock implements Lock{

		private final Sync sync=new Sync();
		@Override
		public void lock() {
			// TODO Auto-generated method stub
			sync.acquire(1);
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			// TODO Auto-generated method stub
			sync.acquireInterruptibly(1);
		}

		@Override
		public boolean tryLock() {
			// TODO Auto-generated method stub
			return sync.tryAcquire(1);
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit)
				throws InterruptedException {
			// TODO Auto-generated method stub
			return sync.tryAcquireNanos(1,unit.toNanos(time));
		}

		@Override
		public void unlock() {
			// TODO Auto-generated method stub
			sync.tryRelease(1);
		}

		@Override
		public Condition newCondition() {
			// TODO Auto-generated method stub
			return sync.newCondition();
		}
		public boolean hasQueuedThreads(){
			return sync.hasQueuedThreads();
		}
		static class Sync extends AbstractQueuedSynchronizer{
			//是否处于占用状态
			protected boolean isHeldExclusively(){
				return getState()==1;
			}
			//状态为0独占获取锁
			public boolean tryAcquire(int acquires){
				if(compareAndSetState(0,1)){
					setExclusiveOwnerThread(Thread.currentThread());
					return true;
				}
				return false;
			}
			//释放锁,状态设置为0
			public boolean tryRelease(int release){
				if(getState()==0)
					throw new IllegalMonitorStateException();
				setExclusiveOwnerThread(null);
				setState(0);
				return true;
			}
			Condition newCondition(){
				return new ConditionObject();
			}
		}
		
	}

