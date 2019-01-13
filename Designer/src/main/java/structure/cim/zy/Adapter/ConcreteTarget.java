package structure.cim.zy.Adapter;

//具体目标类，只提供普通功能 
public class ConcreteTarget implements Target{

	public void request() {
		System.out.println("我实现了充电功能");
		
	}

}
