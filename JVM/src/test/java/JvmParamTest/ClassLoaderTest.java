package JvmParamTest;

import java.lang.reflect.Method;

public class ClassLoaderTest extends ClassLoader{
  
  
  public ClassLoaderTest() {
    super();
    // TODO Auto-generated constructor stub
  }

  public ClassLoaderTest(ClassLoader parent) {
    super(parent);
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    try {
      //系统类加载器
    System.out.println(ClassLoader.getSystemClassLoader());
      //加载类文件
     //method area
    
     System.out.println(Class.forName("JvmParamTest.Lava").getMethods());
     for (Method method : Class.forName("JvmParamTest.Lava").getMethods()) {
      System.out.println("method:"+method.getName());
    }
  
    
      
    } catch (ClassNotFoundException e) {
    
      e.printStackTrace();
    }

  }
}
