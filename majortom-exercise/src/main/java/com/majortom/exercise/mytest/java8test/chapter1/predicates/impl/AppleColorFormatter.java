package com.majortom.exercise.mytest.java8test.chapter1.predicates.impl;

import com.majortom.exercise.mytest.java8test.chapter1.entity.Apple;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.AppleFormatter;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/14 11:22
 */
public class AppleColorFormatter implements AppleFormatter {
    @Override
    public String format(Apple apple) {
        return "The apple's color is " + apple.getColor();
    }
}
