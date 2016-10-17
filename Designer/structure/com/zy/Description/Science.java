package com.zy.Description;

public class Science  extends GirlDecorator{

	
	private Girl gril;
	public Science (Girl girl)
	{
		this.gril=girl;
	}
	@Override
	public String getDescription() {
		return this.gril.getDescription()+"like science"; 
		
	}
	
	public void caltulateStuff() {
		System.out.println("scientific calculation!");

	}
	
}
