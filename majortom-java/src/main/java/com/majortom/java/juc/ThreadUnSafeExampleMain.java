package com.majortom.java.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * 多线程数据不一致Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/19 15:22
 **/
public class ThreadUnSafeExampleMain {
    public static void main(String[] args) throws InterruptedException {
        final int threadSize = 1000;
        ThreadUnSafeExample threadUnSafeExample = new ThreadUnSafeExample();
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                threadUnSafeExample.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdownNow();
        System.out.println(threadUnSafeExample.get());
    }
}
