package com.majortom.java.juc;

/**
 * <p>
 * 多线程数据不一致Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/19 15:21
 **/
public class ThreadUnSafeExample {
    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}
