package com.majortom.effectivejava.chapter1.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/13 21:56
 **/
public class Elvis2Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.majortom.effectivejava.chapter1.singleton.Elvis2");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
