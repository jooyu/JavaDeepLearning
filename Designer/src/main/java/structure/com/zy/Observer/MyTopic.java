package structure.com.zy.Observer;

import java.util.ArrayList;
import java.util.List;



public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTX=new Object();
	//构造函数初始化
	public MyTopic() {
		// TODO Auto-generated constructor stub
		this.observers=new ArrayList<>();
	}

	//注册
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
	//如果没有那么添加
		if(!observers.contains(obj)) 
			observers.add(obj);

		
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		 observers.remove(obj);
		
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal=null;
		synchronized (MUTX) {
			if(!changed)
			{
				return ;	
			}
			observersLocal=new ArrayList<>(this.observers);
			//observersLocal=this.observers;
			this.changed=false;
		}
		for(Observer obj:observersLocal)
		{
			obj.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}

	public void postMessage(String msg){
		
		        System.out.println("Message Posted to Topic:"+msg);
		
		        this.message=msg;
		
		        this.changed=true;
		
		        notifyObservers();
		
		    }

}
