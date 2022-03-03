package com.majortom.exercise.mytest.java8test.chapter8.factory;

/**
 * <p>
 * 工厂模式：工厂类
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 17:25
 */
public class ProductFactory {

    public static Product createProduct(String name) {
        switch (name) {
            case "Loan":
                return new Product("Loan");
            case "Stock":
                return new Product("Stock");
            case "Bone":
                return new Product("Bone");
            default:
                throw new RuntimeException("No such product!");
        }
    }

}
