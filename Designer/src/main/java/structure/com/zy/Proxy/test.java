package structure.com.zy.Proxy;

/**
 * 静态代理
 * @author eaves.zhu
 *
 */
public class test {
	public static void main(String[] args) {
		Subject sub = new ProxySubject();
		sub.request();
		
	}

}
