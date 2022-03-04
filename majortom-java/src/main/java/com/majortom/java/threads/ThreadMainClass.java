package com.majortom.java.threads;

import com.majortom.java.threads.entity.RunnableDemo;
import com.majortom.java.threads.entity.ThreadDemo;

/**
 * <p>
 * 多线程Demo
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/4 14:29
 */
public class ThreadMainClass {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();

        ThreadDemo t1 = new ThreadDemo("Thread-3");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread-3");
        t2.start();
    }
}
