package com.majortom.java.principle.factory.abs;

/**
 * <p>
 * 产品等级2的实现类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/30 12:21
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
