package com.majortom.java.principle.factory.abs;

/**
 * <p>
 * 场景类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/30 12:23
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //生产A1对象
        AbstractProductA a1 = creator1.createProductA();
        //生产A2对象
        AbstractProductA a2 = creator2.createProductA();
        //生产B1对象
        AbstractProductB b1 = creator1.createProductB();
        //生产B2对象
        AbstractProductB b2 = creator2.createProductB();
        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
    }
}
