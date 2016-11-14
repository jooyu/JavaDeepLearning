package com.zy.Mediator;
public class Anchor {  
  private boolean free;  

  private Mediator med;  
  public Anchor(Mediator md){  
   med=md;  
  }  

  public boolean isFree() {  
   return free;  
  }  

  public void setFree(boolean free) {  
   this.free = free;  
  }  

  //通过中介者来开始说话  
  public void speak() {  
   med.anchorSpeak();  
  }  

  //通过中介者来停止说话  
  public void stop() {  
   med.anchorStop();  
  }  

}  
