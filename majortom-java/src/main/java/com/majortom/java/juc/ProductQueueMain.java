package com.majortom.java.juc;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/18 13:49
 **/
public class ProductQueueMain {
    public static void main(String[] args) throws InterruptedException {
        ProductQueue<String> queue = new ProductQueue<>();
        System.out.println(queue.getCapacity());
        Thread[] productThread=new Thread[5];
        Thread[] consumerThread=new Thread[5];
        for (int i = 0; i < productThread.length; i++) {
            productThread[i]= new Thread(() -> {
                try {
                    queue.put("thread running......");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        for (int i = 0; i < consumerThread.length; i++) {
            consumerThread[i]= new Thread(() -> {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        for (Thread thread : productThread) {
            thread.start();
        }
        for (Thread thread : consumerThread) {
            thread.start();
        }
    }
}
