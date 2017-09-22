package org.yujoo.proxy.demo;

public class Proxy1  implements RentOut{

	
	private HouseHolder houseHolder;

	// 重写租房方法，添加中介操作
    @Override
    public void renOut()
    {
        this.preRentOut(); // 代理对象添加自己的操作
        
        if(null == houseHolder)
        {
            houseHolder = new HouseHolder();
        }
        houseHolder.renOut();
        
        this.postRentOut(); // 代理对象添加自己的操作
    }
    
    // 中介操作，租房前收中介费
    public void preRentOut()
    {
        System.out.println("I need more money!");
    }
    
    // 中介操作，租房后扣押金
    public void postRentOut()
    {
        System.out.println("I will deduct some money!");
    }
	
}
