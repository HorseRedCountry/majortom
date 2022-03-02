package com.majortom.exercise.mytest.java8test.chapter8.cor;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 12:18
 */
public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    protected String handWork(String text) {
        return "From Raoul,Mario and Alan: " + text;
    }
}
