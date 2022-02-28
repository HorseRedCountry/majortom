package com.majortom.exercise.mytest.java8test.chapter8.observer;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/28 17:07
 */
public interface Subject {

    void registerObserver(Observer o);

    void notifyObservers(String tweet);

}
