package structure.com.zy.DyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	

	public DynamicProxyHandler(Object proxied) {
		super();
		this.proxied = proxied;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//动态获得运行时的class信息
		System.out.println("*** proxy ***" + proxy.getClass());
        System.out.println("*** method ***" + method);
        System.out.println("*** args ***" + args);
        // 可以在这里做一些处理，如查看方法名，查看方法签名的其他方面，甚至可以搜索特定的参数值
        if(method.getName().equals("doSomething"))
            System.out.println("Proxy detected the interesting method.");
        // 将请求转发给被代理对象，并传入必须的参数
        return method.invoke(proxied, args);
	}

}
