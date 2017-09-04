package com.zy.Object;

class Prototype implements Cloneable {
	public Prototype clone(){
		Prototype prototype = null;
		try{
			prototype = (Prototype)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return prototype; 
	}
}

class ConcretePrototype extends Prototype{
	public void show(){
		System.out.println("原型模式实现类");
	}
}


