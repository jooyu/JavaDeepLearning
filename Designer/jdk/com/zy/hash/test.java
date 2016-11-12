package com.zy.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class test {
/**
 * hashmap是一个数组和链表结合体,继承自AbstractMap类实现Map接口jdk1.2之后才有
 * key的hash决定元素在数组的下标位置，多个数据链表链接
 * 线程不安全的，需要实现同步机制Map m = Collections.synchronizedMap(new HashMap(...));
 * 可以用null作为键
 * 不保证同步机制，并发访问速度快
 * 初始容量16，加载因子0.75
 */

	


/**
 * hashtable继承自Dictionary 类实现Map接口在jdk1.0就已经有了
 * 线程安全的实现sychronsized
 * 不可以用null作为键
 * 并发访问速度慢
 * 初始容量11，加载因子0.75
 * Dictionary官方称已过时
 */
	
	
	
	
	
	
/**
 * ConcurrentHashMap是Map的一种并发实现，read都是无锁的，而write操作需要被同步，使用场景：读操作远大于写操作
 * ConcurrentHashMap将所有的元素分成若干个segment，每一个segment都是独立的，segment本身是一个hashtable
 * 对于一个加入ConcurrentHashMap的<key, value>对，key的hash值中的高位被用来索引segment，而低位用于segment中的索引
 * 
 */
	
	

}
