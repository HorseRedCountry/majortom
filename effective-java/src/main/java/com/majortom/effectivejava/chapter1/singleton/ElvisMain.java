package com.majortom.effectivejava.chapter1.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/13 21:40
 **/
public class ElvisMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Elvis instance = Elvis.INSTANCE;
        instance.leaveTheBuilding();
        Elvis instance2 = Elvis.INSTANCE;
        instance2.leaveTheBuilding();
        Class<?> aClass = Class.forName("com.majortom.effectivejava.chapter1.singleton.Elvis");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();

    }
}
