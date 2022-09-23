package com.majortom.java.principle.factory.simplefactory;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/23 13:58
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制了一个圆形......");
    }
}
