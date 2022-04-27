package com.majortom.java.principle.di;

/**
 * <p>
 *  依赖倒置 启动类
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/27 15:07
 */
public class DiClient {
    public static void main(String[] args) {
        IDriver majortom = new Driver();
        majortom.drive(new Benz());
        majortom.drive(new Bmw());
    }
}
