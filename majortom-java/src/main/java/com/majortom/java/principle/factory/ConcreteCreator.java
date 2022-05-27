package com.majortom.java.principle.factory;

/**
 * <p>
 * 具体工厂类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/27 12:32
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> t) {
        Product product = null;
        try {
            product = (Product) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
