package com.majortom.exercise.mytest;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 *  定义一个苹果
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/12 19:30
 */
@Data
@Builder
public class Apple {
    private String color;
    private String name;
    private Integer year;
}
