package com.majortom.java.threads.entity;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <p>
 * 线程创建：实现Callable接口
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/4 15:24
 */
public class CallableThreadTest implements Callable<Integer> {

    public static void main(String[] args) {
        CallableThreadTest callableThreadTest = new CallableThreadTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableThreadTest);
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量i的值：" + i);
            if (i == 20) {
                new Thread(futureTask, "有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值： " + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}

