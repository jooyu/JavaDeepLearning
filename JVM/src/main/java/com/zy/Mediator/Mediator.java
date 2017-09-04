package com.zy.Mediator;

public class Mediator {  
  /* 
   * 中介者类，并和两个参与者进行关联，两个参与者在中介者这里注册 
   */  
  private Anchor anchor;  
  private Guest guest;  
  public void regAnchor(Anchor anchor){  
   this.anchor=anchor;  
  }  
  public void regGuest(Guest guest){  
   this.guest=guest;  
  }  
  //中介代替主持人说话，如果嘉宾在说话，打断他，主持人说，主持人的状态变为忙碌  
 public void anchorSpeak(){  
  if(!guest.isFree()){  
   guest.stop();  
  }  
  System.out.println("Anchor is speaking....");  
  anchor.setFree(false);  
 }  
 //中介代替嘉宾说话，如果主持人空闲，嘉宾才能说话，嘉宾状态变为忙碌，  
 //否则，不让嘉宾说话，主持人继续说  
 public void guestSpeak(){  
  if(anchor.isFree()){  
   System.out.println("Guest is speaking....");  
   guest.setFree(false);  
  }  
  else{  
   System.out.println("Anchor is speaking. Do not interrupt...");  
  }  
    
 }  
 //中介代替主持人停止说话，设置状态为空闲  
 public void anchorStop(){  
  System.out.println("Anchor stop speaking now....");  
  anchor.setFree(true);  
 }  
 //中介代替嘉宾停止说话，设置状态为空闲  
 public void guestStop(){  
  System.out.println("Guest stop speaking now...");  
  guest.setFree(true);  
    
 }  
 }  