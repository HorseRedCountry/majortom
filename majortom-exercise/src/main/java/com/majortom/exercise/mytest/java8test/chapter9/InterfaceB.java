package com.majortom.exercise.mytest.java8test.chapter9;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/3 10:59
 */
public interface InterfaceB extends InterfaceA {
    @Override
    default void hello() {
        System.out.println("Hello from interfaceB");
    }
}
