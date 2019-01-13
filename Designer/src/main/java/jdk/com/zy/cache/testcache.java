package jdk.com.zy.cache;

public class testcache {

	public static void main(String[] args) {
		 SimpleCache<String ,String> cache=new SimpleCache<>(10);
		 cache.put("1", "hello");
		 cache.put("2", "world");
		 System.out.println(cache.get("1"));
		 System.out.println(cache.get("2"));
	}
}
