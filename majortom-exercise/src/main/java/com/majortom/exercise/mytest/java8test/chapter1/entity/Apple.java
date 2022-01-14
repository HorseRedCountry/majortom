package com.majortom.exercise.mytest.java8test.chapter1.entity;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 *  苹果类定义
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/14 10:18
 */
@Data
@Builder
public class Apple {
    private String color;
    private Integer weight;
}
