package com.majortom.exercise.mytest.java8test.chapter8.strategy;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 19:08
 */
public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
