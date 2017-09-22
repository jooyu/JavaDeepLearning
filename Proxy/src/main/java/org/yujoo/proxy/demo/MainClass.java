package org.yujoo.proxy.demo;
public class MainClass {

	  public static void main(String[] args){

	    ClassLoader classLoader = MainClass.class.getClassLoader();

	    try {
	        Class aClass = classLoader.loadClass("org.yujoo.proxy.demo.MainClass");
	        System.out.println("aClass.getName() = " + aClass.getName());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	  }
	  }