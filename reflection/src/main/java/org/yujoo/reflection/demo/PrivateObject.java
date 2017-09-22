package org.yujoo.reflection.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateObject {

	private String privateString = null;

	public PrivateObject(String privateString) {
		this.privateString = privateString;
	}

	private String getPrivateString() {

		return this.privateString;

	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		PrivateObject privateObject = new PrivateObject("the private value");
		Field privateStringfield = PrivateObject.class.getDeclaredField("privateString");
		privateStringfield.setAccessible(true);
		String fieldValue = (String) privateStringfield.get(privateObject);
		System.out.println("fieldValue=" + fieldValue);
		
		Method privateStringMethod = PrivateObject.class.getDeclaredMethod("getPrivateString", null);
	

		String returnValue = (String)privateStringMethod.invoke(privateObject, null);

		System.out.println("returnValue = " + returnValue);
		
	}
}
