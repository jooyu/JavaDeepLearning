package com.zy.Responsibility;

/**
 *抽象处理者的定义，定义一个处理请求的接口，如果需要，接口可以定义出一个方法可以设定和返回下架的引用，这个角色通常由一个java抽象类或者java接口实现
 *具体的处理者角色，具体的处理请求接收到请求后，可以选择请求处理，或者将请求传给下一家
 * @author eaves.zhu
 *
 */
public abstract class Handler {
	//持有后继的责任对象
protected Handler successor;

//事宜处理请求的方法
public abstract void handleRequest();

public Handler getSuccessor(){
	return successor;
}

public void setSuccessor(Handler successor){
	this.successor=successor;
}

}
