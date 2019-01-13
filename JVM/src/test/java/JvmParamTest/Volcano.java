package JvmParamTest;

import com.carrotsearch.sizeof.RamUsageEstimator;

public class Volcano {
	public static void main(String[] args) throws IllegalAccessException {

	    Lava lava = new Lava();
	    System.out.println("methods:"+RamUsageEstimator.sizeOf(lava.getClass().getMethods()));
	   // Test test=new Test();
	    System.out.println("Lava bytes:"+RamUsageEstimator.sizeOf(lava));
	  //  System.out.println("test bytes:"+RamUsageEstimator.sizeOf(test));
	    Object jlo=new Object();
	    System.out.println("object:"+RamUsageEstimator.sizeOf(jlo));//空的对象 8+8
	    System.out.println("float:"+RamUsageEstimator.sizeOf(new Float(1.0)));
	    System.out.println("double:"+RamUsageEstimator.sizeOf(new Double(1.0)));
	    System.out.println("byte:"+RamUsageEstimator.sizeOf(new Byte("1")));
	    System.out.println("short:"+RamUsageEstimator.sizeOf(new Short((short) 1)));
	   
	    System.out.println("Integer:"+RamUsageEstimator.sizeOf(new Integer(1)));
	    System.out.println("long:"+RamUsageEstimator.sizeOf(new Long(10000)));
	    System.out.println("char:"+RamUsageEstimator.sizeOf(new Character('1')));
	    
	    System.out.println("boolean:"+RamUsageEstimator.sizeOf(new Boolean(true)));
	    System.out.println("array:"+RamUsageEstimator.sizeOf(new String[]{"a","b","c","d","e"}));
	    //lava对象结构：className()
	    System.out.println("Lava:"+lava.toString());
	    System.out.println("loader:"+lava.getClass().getClassLoader());
	   
	    System.out.println("supperclass:"+lava.getClass().getSuperclass());
	    //lava.flow();
	    System.out.println("class:"+ lava.getClass());
	    
	}
}
