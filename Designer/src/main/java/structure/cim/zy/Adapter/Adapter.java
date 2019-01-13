package structure.cim.zy.Adapter;

//适配器集成继承
public class Adapter extends Adaptee implements Target {

	
	public void request() {
		//适配器首先要适合旧的充电器
		//接口里面实现了原先的基本功能，充电
		
		super.specificRequest(); 
		//System.out.println("我在原有充电基础上实现了新的充电功能，");
		
	}

}
