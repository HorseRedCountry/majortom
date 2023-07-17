package com.majortom.java.juc;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/17 11:07
 **/
public class AutomaticIntegerWithLockMain {

    public static void main(String[] args) throws InterruptedException {
        final int max = 100;
        final int loopCount = 100000;
        long costTime = 0;
        for (int i = 0; i < max; i++) {
            long beginTime = System.nanoTime();
            AutomaticIntegerWithLock value = new AutomaticIntegerWithLock(0);
            Thread[] threadArr = new Thread[max];
            for (int j = 0; j < max; j++) {
                threadArr[j] = new Thread() {
                    @Override
                    public void run() {
                        for (int k = 0; k < loopCount; k++) {
                            value.incrementAndGet();
                        }
                    }
                };
            }
            for (Thread t : threadArr) {
                t.start();
            }
            for (Thread t : threadArr) {
                t.join();
            }
            long endTime = System.nanoTime();
            costTime += (endTime - beginTime);
        }
        System.out.println("Cost1："+costTime);
        System.out.println();
        costTime=0;
        final Object lock=new Object();
        for (int i = 0; i < max; i++) {
            long beginTime = System.nanoTime();
            Thread[] threadArr = new Thread[max];
            for (int j = 0; j < max; j++) {
                threadArr[j] = new Thread() {
                    @Override
                    public void run() {
                        for (int k = 0; k < loopCount; k++) {
                            synchronized (lock){
                                ++staticValue;
                            }
                        }
                    }
                };
            }
            for (Thread t : threadArr) {
                t.start();
            }
            for (Thread t : threadArr) {
                t.join();
            }
            long endTime = System.nanoTime();
            costTime += (endTime - beginTime);
        }
        System.out.println("Cost2："+costTime);
    }

    static int staticValue=0;

}
