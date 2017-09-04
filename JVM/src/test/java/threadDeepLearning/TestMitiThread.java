package threadDeepLearning;
public class TestMitiThread {
  public static void main(String[] rags) {
      System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
      new MitiSay("A").start();
      new MitiSay("B").start();
      System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
  }
}

class MitiSay extends Thread {
  public MitiSay(String threadName) {
      super(threadName);
  }

  public void run() {
      System.out.println(getName() + " 线程运行开始!");
      for (int i = 0; i < 10000; i++) {
          System.out.println(i + " " + getName());
          try {
              sleep((int) Math.random() * 10);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      System.out.println(getName() + " 线程运行结束!");
  }
}