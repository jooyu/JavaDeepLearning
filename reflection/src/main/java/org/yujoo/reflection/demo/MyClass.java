package org.yujoo.reflection.demo;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

public class MyClass {
	protected List<String> stringList=new LinkedList<String>();

	public List<String> getStringList() {

		return this.stringList;

	}
	

}
