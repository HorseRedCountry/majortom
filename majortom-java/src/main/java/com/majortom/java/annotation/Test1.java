package com.majortom.java.annotation;

import lombok.Data;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/30 10:44
 */
@Data
@MyAnnotation(getValue = "Annotaion on class")
public class Test1 {

    @MyAnnotation(getValue = "Annotaion on field")
    public String name;

    @MyAnnotation(getValue = "Annotaion on method")
    public void hello(){}

    @MyAnnotation()
    public void defaultMethod(){}

}
