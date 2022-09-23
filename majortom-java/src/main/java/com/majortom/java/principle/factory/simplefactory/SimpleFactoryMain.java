package com.majortom.java.principle.factory.simplefactory;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/23 14:16
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        //创建工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        //根据工厂创建对象
        Shape shape = shapeFactory.getShape(ShapeEnum.CIRCLE);
        //调用对象方法
        shape.draw();
    }
}
