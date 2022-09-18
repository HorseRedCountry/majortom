package com.majortom.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>
 * 处理注解
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/18 16:48
 */
public class AnnotionInjection {

    /**
     * 通过反射 获取注解的相关属性并进行处理
     *
     * @param obj 待处理的类
     * @return /
     */
    public static Object getBean(Object obj) {
        try {
            //获取类属所有性
            Field[] fields = obj.getClass().getDeclaredFields();
            //遍历，进行处理
            for (Field field : fields) {
                //获取属性注解
                HorseAnno annotation = field.getAnnotation(HorseAnno.class);
                if (null != annotation) {
                    System.err.println("注入" + field.getName() + "属性" + "，属性值为：" + annotation.value());
                    //反射调用public set 方法，如果为访问级别为private，那么可以直接使用属性的set(obj,value);
                    obj.getClass()
                            .getMethod("set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1),
                                    new Class[]{String.class})
                            .invoke(obj, annotation.value());
                }
            }
            //获取所有方法
            Method[] methods = obj.getClass().getDeclaredMethods();
            for (Method method : methods) {
                //遍历，获取方法注解
                HorseAnno annotation = method.getAnnotation(HorseAnno.class);
                if (null != annotation) {
                    System.err.println("注入" + method.getName() + "方法" + "，方法值为：" + annotation.Property());
                    method.invoke(obj, annotation.Property());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
