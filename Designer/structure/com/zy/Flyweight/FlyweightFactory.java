package com.zy.Flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable flyweights=new Hashtable();
	public FlyweightFactory ()
	{
	}
	
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight=(Flyweight)flyweights.get(obj);
		if(flyweight==null)
		{//如果为空
			flyweight=new ConcreteFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize()
	{
		return flyweights.size();
	}
}


