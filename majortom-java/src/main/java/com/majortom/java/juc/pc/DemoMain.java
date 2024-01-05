package com.majortom.java.juc.pc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/12/28 13:42
 **/
public class DemoMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService producerService = Executors.newFixedThreadPool(5);
        ExecutorService consumerService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            producerService.execute(Producer::new);
        }
        for (int i = 0; i < 10; i++) {
            consumerService.execute(Consumer::new);
        }
    }
}
