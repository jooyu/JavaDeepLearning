package com.zy.bridge;

public class SonyTV implements ITV {

	@Override
	public void on() {
		System.out.println("Sony is turned on.");
		
	}

	@Override
	public void off() {
		System.out.println("Sony is turned off.");
		
	}

	@Override
	public void switchChannel(int channel) {
		  System.out.println("Sony: channel - " + channel);
		
	}
public void photo()
{
	
System.out.println("sony  take photo");}
}
