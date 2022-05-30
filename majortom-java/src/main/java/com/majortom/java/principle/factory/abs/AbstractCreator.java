package com.majortom.java.principle.factory.abs;

/**
 * <p>
 * 抽象工厂类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/30 12:19
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     *
     * @return 产品
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return 产品
     */
    public abstract AbstractProductB createProductB();

}
