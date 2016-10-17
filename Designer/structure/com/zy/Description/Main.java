package com.zy.Description;

/**
 * 
 * @author eaves.zhu
 *装饰者模式也叫包装模式，就是一层层的往外包装，区别于组合模式，正常系统中比较少见，大多是半装饰模式
 */
public class Main {
	public static void main(String[] args) {

	//普通美国女孩
			Girl g1 = new AmericanGirl();
			System.out.println(g1.getDescription());

			//喜欢科学的
//			Science g2 = new Science(g1);
//			System.out.println(g2.getDescription());

			//喜欢艺术的
			Art g3 = new Art(g1);
			System.out.println(g3.getDescription());
			
			Girl g4=new EuropeanGirl();
			System.out.println(g4.getDescription());
}
}
