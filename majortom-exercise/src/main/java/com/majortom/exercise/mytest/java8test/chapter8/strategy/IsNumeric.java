package com.majortom.exercise.mytest.java8test.chapter8.strategy;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 19:09
 */
public class IsNumeric implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
