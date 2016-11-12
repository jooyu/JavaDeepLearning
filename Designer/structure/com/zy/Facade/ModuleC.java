package com.zy.Facade;

public class ModuleC {  
    //示意方法  
    public void testC(){  
        System.out.println("调用ModuleC中的testC方法");  
    }  
    
    /** 
     * 提供给子系统外部使用的方法 
     */  
    public void c1(){};  
      
    /** 
     * 子系统内部模块之间相互调用时使用的方法 
     */  
    private void c2(){};  
    private void c3(){};  
} 