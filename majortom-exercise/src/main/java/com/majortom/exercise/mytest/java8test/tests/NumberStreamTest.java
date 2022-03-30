package com.majortom.exercise.mytest.java8test.tests;

import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.stream.IntStream;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/11 10:58
 */
public class NumberStreamTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + "  "));
        System.out.println();
        System.out.println(DateTime.now().dayOfMonth());

        String jsonString = "[{\"weight\":70,\"departmentName\":\"PMC部\",\"departmentId\":\"122\"},{\"weight\":30,\"departmentName\":\"工程部\",\"departmentId\":\"125\"}]";
        JSONArray jsonArray = JSONUtil.parseArray(jsonString);
        for (Object object : jsonArray) {
            System.out.println(object);
            JSONObject jsonObject = JSONUtil.parseObj(object);
            System.out.println(jsonObject.get("departmentId"));
        }

    }
}
