package org.yujoo.reflection.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, IllegalAccessException {

			MyName myname = new MyName();
			Class<?> clazz = MyName.class;
			Annotation[] annotations = clazz.getAnnotations();
			Field[] meyhod=clazz.getFields();
			Field field=clazz.getField("first_name");
			Object value=field.get(myname);
			if(value==null)
				field.set(myname, "");
			else
				field.set(myname, value);
			System.out.println(myname.getFirst_name());
			MyName test=new MyName();
			test.setFirst_name("haha");
			System.out.println(test.getFirst_name());
			// 获得string 的class类型
			System.out.println("-----------------------------------------------");
			Method[] methods=clazz.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			System.out.println("-----------------------------------------------");
					 
			
			  for(Method method : methods){
			
			    if(isGetter(method)) System.out.println("getter: " + method);
			
			    if(isSetter(method)) System.out.println("setter: " + method);
			  }
			
			  }

	public static boolean isGetter(Method method) {

		if (!method.getName().startsWith("get"))
			return false;

		if (method.getParameterTypes().length != 0)
			return false;

		if (void.class.equals(method.getReturnType()))
			return false;

		return true;

	}

	public static boolean isSetter(Method method) {

		if (!method.getName().startsWith("set"))
			return false;

		if (method.getParameterTypes().length != 1)
			return false;

		return true;

	}
}
// Class<?> c = String.class;
// // 获得class的类实例
// Object str = c.newInstance();
// Constructor constructor = c.getConstructor(String.class);
// Object obj = constructor.newInstance("111");
// System.out.println(obj);

// } catch (InstantiationException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
