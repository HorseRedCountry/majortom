package com.majortom.exercise.mytest.java8test.chapter2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 * 交易类
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/9 19:11
 */
@Data
@AllArgsConstructor
public class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
