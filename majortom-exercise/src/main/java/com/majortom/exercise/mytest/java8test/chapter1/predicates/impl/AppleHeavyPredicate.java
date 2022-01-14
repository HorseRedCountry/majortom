package com.majortom.exercise.mytest.java8test.chapter1.predicates.impl;

import com.majortom.exercise.mytest.java8test.chapter1.entity.Apple;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.ApplePredicate;

import java.util.function.Predicate;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/14 10:55
 */
public class AppleHeavyPredicate implements ApplePredicate {

    @Override
    public boolean predicate(Apple apple) {
        return apple.getWeight()>100;
    }
}
