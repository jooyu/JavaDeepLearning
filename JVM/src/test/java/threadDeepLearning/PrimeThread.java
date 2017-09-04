package threadDeepLearning;

public class PrimeThread  extends Thread {
  
  
  long minPrime;
  PrimeThread(long minPrime) {
      this.minPrime = minPrime;
  }

  public void run() {
    
  }
  public static void main(String[] args){
    
    PrimeThread p = new PrimeThread(143);
    p.start();
   
    System.out.println("id:"+p.getId());
    System.out.println("Name:"+p.getName());
    System.out.println("priority"+p.getPriority());
    System.out.println("class:"+p.getClass());
    System.out.println("state:"+p.getState());
    System.out.println("group"+p.getThreadGroup());
   try {
    p.sleep(1000);
  } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
      System.out.println("id:"+p.getId());
      System.out.println("Name:"+p.getName());
      System.out.println("priority"+p.getPriority());
      System.out.println("class:"+p.getClass());
      System.out.println("state:"+p.getState());
      System.out.println("group"+p.getThreadGroup());
      p.stop();
  }
}
