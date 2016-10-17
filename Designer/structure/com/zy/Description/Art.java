package com.zy.Description;

public class Art extends GirlDecorator {

	private Girl girl;

	public Art(Girl girl){
		this.girl = girl;
	}

	@Override
	public String getDescription() {
		return this.girl.getDescription() + "+Like Art";
	}

	public void draw() {
		System.out.println("draw pictures!");
	}
}
