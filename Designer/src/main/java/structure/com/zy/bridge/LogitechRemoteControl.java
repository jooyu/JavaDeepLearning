package structure.com.zy.bridge;

/**
 * 遥控器抽象类的具体实现
 *继承拥有父类的所有方法，如果不实现抽象方法，那么还是抽象类，如果实现，那么不是抽象类
 * @author eaves.zhu
 *
 */
public class LogitechRemoteControl extends AbstractRemoteControl{

	public LogitechRemoteControl(ITV tv) {
		super(tv);
		// TODO Auto-generated constructor stub
	}



	public void setChannelKeyboard(int channel) {
		setChannel(channel);
		System.out.println("Logitech use keyword to set channel.");
	}

	
}
