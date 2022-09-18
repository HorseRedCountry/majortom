package com.majortom.java.annotation;

import lombok.Data;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/18 16:43
 */
@Data
public class MyDog {

    @HorseAnno
    private String name;

    private String property;

    @HorseAnno
    public String printProperty(String property) {
        System.out.println("属性值为：" + property);
        return property;
    }

}
