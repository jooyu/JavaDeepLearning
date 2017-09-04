package com.zy.bridge;

/**
 * 遥控器的抽象类
 * @author eaves.zhu
 *2016.10.16
 */
public  abstract class AbstractRemoteControl {
	private ITV tv;

	public AbstractRemoteControl(ITV tv) {
		super();
		this.tv = tv;
	}
	//遥控器的抽象类实现开电视的方法
	public  void turnOn()
	{
		tv.on();
	}
	public void turnOff()
	{
		tv.off();
	}
	public void setChannel(int channel){
		tv.switchChannel(channel);
		
	}
	

}
