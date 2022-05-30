package com.majortom.java.principle.factory.abs;

/**
 * <p>
 * 抽象产品类B
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/30 12:13
 */
public abstract class AbstractProductB {
    /**
     * 产品的公用方法
     */
    public void shareMethod() {
    }

    /**
     * 产品相同方法的不同实现
     */
    public abstract void doSomething();
}
