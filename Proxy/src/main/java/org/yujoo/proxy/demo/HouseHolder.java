package org.yujoo.proxy.demo;

//创建房主类（真实角色）
public class HouseHolder implements RentOut
{

	@Override
	public void renOut() {
		// TODO Auto-generated method stub
		 System.out.println("I’m renting the house!");
	}    

}