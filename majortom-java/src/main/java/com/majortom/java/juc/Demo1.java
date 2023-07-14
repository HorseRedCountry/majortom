package com.majortom.java.juc;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/14 15:37
 **/
public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        FlagThread t1 = new FlagThread();
        t1.start();
//        t1.join();
        for (;;) {
//            synchronized (t1){
                System.out.println("for loop execute！");
                if (t1.flagNow()) {
                    System.out.println("flag now is true!!!");
//                }
            }
        }
    }

}

class FlagThread extends Thread {
    private boolean flag = false;

    public boolean flagNow() {
        return flag;
    }

    @Override
    public void run() {
        System.out.println("begin Flag now：" + flag);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("end Flag now：" + flag);
    }
}
