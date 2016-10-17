package com.zy.Template;

/**
 * 子类2号继承了抽象的父类并同时实现了钩子方法
 * @author eaves.zhu
 *
 */
public class SubClassTwo  extends TemplateAbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("do another thing by subClassTwo");
		
	}
	/**钩子方法*/
	@Override 
	public void hookMethod() { 
		System.out.println("hook method in subClassTwo"); 
		}
}
