package com.majortom.exercise.mytest.java8test.chapter9;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/3 10:58
 */
public interface InterfaceA {
    default void hello(){
        System.out.println("Hello from interfaceA");
    }
}
