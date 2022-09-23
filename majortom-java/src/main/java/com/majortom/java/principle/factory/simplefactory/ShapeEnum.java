package com.majortom.java.principle.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 形状枚举定义
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/23 14:00
 */
@Getter
@AllArgsConstructor
public enum ShapeEnum {

    /**
     * 枚举定义
     */
    CIRCLE(1, "圆形"),
    SQUARE(2, "正方形"),
    RECTANGLE(3, "矩形");


    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

}
