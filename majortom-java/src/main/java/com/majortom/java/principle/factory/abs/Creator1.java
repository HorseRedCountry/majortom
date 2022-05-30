package com.majortom.java.principle.factory.abs;

/**
 * <p>
 * 产品等级1的实现类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/30 12:21
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
