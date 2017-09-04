package com.zy.object;

/**
 * 可能输出0，静态变量的初始化，赋值是由主线程发起，也有可能一直循环
 * @author eaves.zhu
 *
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
