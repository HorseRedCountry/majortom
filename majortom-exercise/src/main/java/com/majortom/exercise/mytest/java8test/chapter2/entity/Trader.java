package com.majortom.exercise.mytest.java8test.chapter2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 * 交易员类
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/9 19:09
 */
@Data
@AllArgsConstructor
public class Trader {
    private String name;
    private String city;
}
