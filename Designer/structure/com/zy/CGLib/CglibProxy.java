package com.zy.CGLib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;





public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        // 设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        // 通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    // 拦截父类所有方法的调用，一个方法拦截依次
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
            MethodProxy proxy) throws Throwable {
        System.out.println("begin...");
        // 通过代理类调用父类中的方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("end...");
        return null;
    }

    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        Animal dog = (Animal)proxy.getProxy(Dog.class);
        //每次依次执行代理的方法
        dog.sound();
        dog.bite();
        
    }
}