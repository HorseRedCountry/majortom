package com.majortom.exercise.mytest.java8test.chapter8.lambdatest;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 22:03
 */
public class LambdaTestMainClass {
    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(13, 2), null);
        points.stream()
                .map(p -> p.getX())
                .forEach(System.out::println);
    }
}
