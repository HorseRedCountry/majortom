package com.majortom.java.threads.entity;

/**
 * <p>
 * 线程创建：实现Runnable接口
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/4 14:31
 */
public class RunnableDemo implements Runnable {

    private Thread thread;
    private String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating... " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running... " + threadName);
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

    public void start() {
        System.out.println("Starting... " + threadName);
        if (null == thread) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
