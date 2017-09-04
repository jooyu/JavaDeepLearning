package com.zy.Singleton;


/**
 * 
 * @author eaves.zhu
 * 饿汉式
 *
 */
public final class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}


/**
 * 
 * @author eaves.zhu
 * 懒汉式
 *
 */
//public final class Singleton
//{
//private static final Singleton instance = null;
//private Singleton()
//{
//}
//
////加锁
//public static synchronized Singleton getInstance() {
//    if (instance == null) instance = new Singleton();
//    return instance;
//}
//
//}


/***
 * @author eaves.zhu
 * java.lang.Runtime实现单例模式   饿汉式
 */
//public class Runtime {
//    private static Runtime currentRuntime = new Runtime();
//
//    private Runtime() {}
//    public static Runtime getRuntime() {
//        return currentRuntime;
//    }
//}



