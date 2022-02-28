package com.majortom.exercise.mytest.java8test.chapter8.observer;

/**
 * <p>
 *  观察者模式
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/28 16:56
 */
public interface Observer {

    /**
     * 唤醒
     * @param tweet 、
     */
    void notify(String tweet);

}
