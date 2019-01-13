package structure.com.zy.Proxy;
/**
 * 真实角色
 * @author eaves.zhu
 *
 */
public class RealSubject extends Subject {

    public RealSubject(){}

    public void request() {
        System.out.println("真实的请求.");
    }
}