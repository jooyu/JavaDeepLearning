package structure.com.zy.bridge;

public class  SamsungTV implements ITV {

	@Override
	public void on() {
		System.out.println("Samsung is turned on.");
		
	}

	@Override
	public void off() {
		System.out.println("Samsung is turned off.");
		
	}

	@Override
	public void switchChannel(int channel) {
		 System.out.println("Samsung: channel - " + channel);
		
	}
	public void music()
	{
		System.out.println("sansumg  get music");
	}

}
