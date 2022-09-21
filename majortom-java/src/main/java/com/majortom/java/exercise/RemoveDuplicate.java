package com.majortom.java.exercise;

import com.google.common.collect.Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>
 * 去重
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/21 22:46
 */
public class RemoveDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total,number;
        System.out.println("请输入总数：");
        total=Integer.parseInt(reader.readLine());
        Map<Integer,Integer> resultMap= new TreeMap<>();
        for (int i = 0; i < total; i++) {
            number=Integer.parseInt(reader.readLine());
            resultMap.put(number,number);
        }
        resultMap.forEach((key, value) -> System.out.println(key));
    }
}
