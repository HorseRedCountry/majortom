package com.majortom.java.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 基于Condition实现的 生产者-消费者 模型
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/18 13:36
 **/
public class ProductQueue<T> {
    private final T[] items;

    private final Lock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();

    private final Condition notEmpty = lock.newCondition();

    private int head, tail, count;

    public ProductQueue(int maxSize) {
        items = (T[]) (new Object[maxSize]);
    }

    public ProductQueue() {
        this(10);
    }

    public int getCapacity() {
        return items.length;
    }

    public int size() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }

    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            while (count == getCapacity()) {
                notFull.await();
            }
            items[tail] = t;
            if (++tail == getCapacity()) {
                tail = 0;
            }
            ++count;
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            T ret = items[head];
            items[head] = null;
            if (++head == getCapacity()) {
                head = 0;
            }
            --count;
            notFull.signalAll();
            return ret;
        } finally {
            lock.unlock();
        }
    }

}
