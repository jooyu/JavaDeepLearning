package structure.com.zy.bridge;

//测试
public class Main {
    public static void main(String[] args){
        ITV tvSony = new SonyTV();//实现sonyTV
        LogitechRemoteControl lrcSony = new LogitechRemoteControl(tvSony);//实现遥控器
        lrcSony.setChannelKeyboard(100);   //设置频道为100 
        
        ITV tvSansumg = new SamsungTV();//实现sonyTV
        LogitechRemoteControl lrcSansumg = new LogitechRemoteControl(tvSansumg);//实现遥控器
        lrcSansumg.setChannelKeyboard(50);
        
    }
}