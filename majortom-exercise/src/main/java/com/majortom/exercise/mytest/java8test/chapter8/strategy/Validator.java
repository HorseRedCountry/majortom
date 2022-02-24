package com.majortom.exercise.mytest.java8test.chapter8.strategy;

import lombok.AllArgsConstructor;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 19:11
 */
@AllArgsConstructor
public class Validator {

    private final ValidationStrategy strategy;

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
