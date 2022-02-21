package com.majortom.exercise.mytest.java8test.chapter5.entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * <p>
 * 三元数定义
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/21 13:23
 */
@Data
@Builder
@AllArgsConstructor
public class TernaryNumber {
    private int a;
    private int b;
    private double c;
}
