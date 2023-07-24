package com.majortom.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/24 15:00
 **/
public class PersonDemoMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.majortom.java.reflect.Person");
        Object obj = cls.newInstance();
        String attribute = "name";
        Method setMethod = cls.getMethod("set" + initCap(attribute), String.class);
        Method getMethod = cls.getMethod("get" + initCap(attribute));
        setMethod.invoke(obj, "张三");
        System.out.println(getMethod.invoke(obj));
    }

    public static String initCap(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }
}
