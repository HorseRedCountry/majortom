package com.majortom.java.threads.entity;

/**
 * <p>
 * 线程创建：继承Thread类，重写run方法
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/4 14:44
 */
public class ThreadDemo extends Thread {

    private Thread thread;
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating... " + threadName);
    }

    @Override
    public void run(){
        System.out.println("Running... "+threadName);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }

    @Override
    public void start() {
        System.out.println("Starting... " + threadName);
        if (null == thread) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}
