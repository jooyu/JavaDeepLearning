package com.zy.Proxy;

/**
 * 代理角色
 * @author eaves.zhu
 *
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject; 

    public ProxySubject(){}

    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
    public void test()
    {
    	System.out.println("非真实类");
    }
}