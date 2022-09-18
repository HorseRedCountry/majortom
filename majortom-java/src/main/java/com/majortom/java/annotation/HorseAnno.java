package com.majortom.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 注解Demo
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/18 15:41
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface HorseAnno {

    String value() default "MajorTom";

    String Property() default "None";
}
