package com.majortom.exercise.mytest.java8test.tests;

import com.google.common.collect.Lists;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.StringJoiner;

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

        List<String> demoList= Lists.newArrayList();
        demoList.add("ma");
        demoList.add("de");
        demoList.add("dafa");
        StringJoiner stringJoiner;
        stringJoiner=new StringJoiner(",");
        demoList.forEach(stringJoiner::add);
        System.out.println(stringJoiner);
        stringJoiner=new StringJoiner(",");
        System.out.println(stringJoiner);

    }
}
