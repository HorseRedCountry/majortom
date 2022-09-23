package com.majortom.java.principle.factory.simplefactory;

/**
 * <p>
 * 工厂类
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/23 14:03
 */
public class ShapeFactory {
    /**
     * 获取图形
     *
     * @param shapeEnum 图形枚举
     * @return 创建的图形
     */
    public Shape getShape(ShapeEnum shapeEnum) {
        if (null == shapeEnum) {
            return null;
        }
        switch (shapeEnum.getCode()) {
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Rectangle();
            default:
                return null;
        }

    }
}
