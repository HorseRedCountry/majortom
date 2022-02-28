package com.majortom.exercise.mytest.java8test.chapter8.observer;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/28 18:09
 */
public class ObserverMainClass {
    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new Lemonde());
        f.notifyObservers("The queen said her favourite book is Java8 in Action!");
    }
}
