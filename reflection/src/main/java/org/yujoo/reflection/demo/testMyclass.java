package org.yujoo.reflection.demo;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class testMyclass {

	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Field field = MyClass.class.getField("stringList");
		Type genericFieldType =field.getGenericType();
		if(genericFieldType instanceof ParameterizedType)
		{
			ParameterizedType aType=(ParameterizedType)genericFieldType;
			Type[] fieldArgTypes=aType.getActualTypeArguments();
					for (Type type : fieldArgTypes) {
						Class typeafter=(Class)type;
						System.out.println("typeafter="+typeafter);
					}
		}
		
	}

}
