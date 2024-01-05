package com.majortom.java.juc.pc;

/**
 * <p>
 * 生产者
 * </p>
 *
 * @author Major Tom
 * @date 2023/12/28 10:54
 **/
public class Producer implements Runnable {

    public Producer() {
        run();
    }

    @Override
    public void run() {

        while (true){
            try {
                Resource.produceResource();
            } catch (FullResourcesException e) {
                try {
                    System.out.println("资源满了......当前先线程为：" + Thread.currentThread().getName());
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

}
