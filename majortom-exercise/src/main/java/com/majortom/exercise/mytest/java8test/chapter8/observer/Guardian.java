package com.majortom.exercise.mytest.java8test.chapter8.observer;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/28 17:02
 */
public class Guardian implements Observer {
    @Override
    public void notify(String tweet) {
        if (null != tweet && tweet.contains("queen")) {
            System.out.println("Yet another news in London..." + tweet);
        }
    }
}
