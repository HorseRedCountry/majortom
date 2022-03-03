package com.majortom.exercise.mytest.java8test.chapter10;

import java.util.Optional;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/3 16:57
 */
public class OptionalUtility {
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
