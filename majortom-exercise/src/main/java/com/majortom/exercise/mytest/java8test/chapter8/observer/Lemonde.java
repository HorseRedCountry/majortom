package com.majortom.exercise.mytest.java8test.chapter8.observer;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/28 17:04
 */
public class Lemonde implements Observer {
    @Override
    public void notify(String tweet) {
        if (null != tweet && tweet.contains("wine")) {
            System.out.println("Today cheese,wine and news! " + tweet);
        }
    }
}
