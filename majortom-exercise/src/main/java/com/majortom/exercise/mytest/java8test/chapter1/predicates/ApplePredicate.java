package com.majortom.exercise.mytest.java8test.chapter1.predicates;

import com.majortom.exercise.mytest.java8test.chapter1.entity.Apple;

/**
 * <p>
 *  断言 接口
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/14 10:20
 */
public interface ApplePredicate {
    /**
     * 断言 接口
     * @param apple /
     * @return /
     */
    boolean predicate(Apple apple);
}
