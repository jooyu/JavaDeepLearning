package com.zy.Observer;

/**
 * 现在创建一个相关联的观察者。它需要有一个方法能使Subject附属于一个观察者。另外的方法能够接受Subject的变化通知。
 * @author eaves.zhu
 *
 */

public interface Observer {

    //method to update the observer, used by subject

    public void update();

    //attach with subject to observe

    public void setSubject(Subject sub);

}

