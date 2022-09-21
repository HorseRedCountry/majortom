package com.majortom.exercise.mytest.java8test.tests;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/21 13:07
 */
public class AuthDemo {
    public static void main(String[] args) {
        String basic="Basic dG9uc2FpbC1laHI6ZWhy";
        basic = basic.replace("Basic ", "");
        String basicPlainText = new String(Base64.getDecoder().decode(basic.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        String clientId = basicPlainText.split(":")[0];
        System.out.println(clientId);
    }
}
