package com.zy.Template;

public class test {

	public static void main(String[] args) {
		TemplateInterface ti1=new SubClassOne();
		TemplateInterface ti2=new SubClassTwo();
		ti1.execute();
		System.out.println("------------------");
		ti2.execute();
	}

}
