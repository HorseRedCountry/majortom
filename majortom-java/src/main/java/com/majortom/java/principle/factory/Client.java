package com.majortom.java.principle.factory;

/**
 * <p>
 * 场景类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/27 12:36
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProductA.class);
        //后续业务处理
    }
}
