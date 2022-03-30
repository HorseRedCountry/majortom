package com.majortom.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/30 10:46
 */
public class AnnotationMainClass {
    public static void main(String[] args) throws Exception{
        Test1 test1 = new Test1();
        System.out.println(test1);
        //通过反射获取注解
        Class<Test1> clazz = Test1.class;
        MyAnnotation annotationOnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.getValue());

        Field name = clazz.getField("name");
        MyAnnotation annotationOnField = name.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnField.getValue());

        Method hello = clazz.getMethod("hello", null);
        MyAnnotation annotationOnMethod = hello.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnMethod.getValue());

        Method defaultMethod = clazz.getMethod("defaultMethod", null);
        MyAnnotation annotationOnDefaultMethod = defaultMethod.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnDefaultMethod.getValue());
    }
}
