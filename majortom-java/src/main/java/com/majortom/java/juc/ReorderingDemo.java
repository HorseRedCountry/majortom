package com.majortom.java.juc;

/**
 * <p>
 * 指令重排序 Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/14 15:12
 **/
public class ReorderingDemo {
    static int x = 0, y = 0, a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            x = y = a = b = 0;
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                }
            };
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                }
            };
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(x + " " + y);
        }

    }
}
