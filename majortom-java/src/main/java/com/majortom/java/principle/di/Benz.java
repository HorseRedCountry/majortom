package com.majortom.java.principle.di;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/27 15:05
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰车开动了......");
    }
}
