package creatation.com.zy.Object;

/**
 * 
 * 通过实现cloneable接口实现父类复制自己
 * @author eaves.zhu
 *
 */
public class Client {
	public static void main(String[] args){
		ConcretePrototype cp = new ConcretePrototype();
		for(int i=0; i< 10; i++){
			ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
			clonecp.show();
		}
	}
}