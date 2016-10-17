package com.zy.Template;

/**
 * 子类1号继承了抽象的父类并并实现了抽象方法并未实现钩子方法
 * @author eaves.zhu
 *
 */
public class SubClassOne  extends TemplateAbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("do another thing by subClassOne");
		
	}

}
