package com.majortom.java.juc.pc;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/12/28 13:40
 **/
public class Consumer implements Runnable {

    public Consumer() {
        run();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Resource.consumeResource();
            } catch (NoResourceException e) {
                try {
                    System.out.println("没有资源了......当前先线程为：" + Thread.currentThread().getName());
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

    }
}
