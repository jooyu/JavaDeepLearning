package action.com.zy.Template;

//抽象类可以不用实现接口的方法，交给实现的子类实现即可
public abstract class TemplateAbstractClass implements TemplateInterface {
	@Override 
	public void execute() {
	preDoSomething(); 
	abstractMethod(); 
	hookMethod(); 
	afterDoSomething(); 
	} 
	
	private void preDoSomething(){ 
		System.out.println("before do some thing in abstract class"); 
		} 
	private void afterDoSomething(){ 
		System.out.println("after do some thing in abstract class"); 
		} 
	/**抽象方法*/ 
	public abstract void abstractMethod(); 
	/**钩子方法*/ 
	public void hookMethod(){ 
		
	}
}
