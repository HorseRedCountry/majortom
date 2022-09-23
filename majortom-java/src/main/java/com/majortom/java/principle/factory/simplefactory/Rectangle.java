package com.majortom.java.principle.factory.simplefactory;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/23 14:00
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制了一个矩形......");
    }
}
