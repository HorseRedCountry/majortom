package com.majortom.exercise.mytest.java8test.tests;

import java.util.stream.IntStream;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/11 10:58
 */
public class NumberStreamTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + "  "));
    }
}
