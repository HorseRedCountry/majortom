package com.majortom.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 自定义注解Demo
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/30 10:41
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String getValue() default "No Description";
}
