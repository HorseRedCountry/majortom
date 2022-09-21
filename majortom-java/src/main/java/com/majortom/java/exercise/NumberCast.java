package com.majortom.java.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * 十六进制转十进制
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/21 23:02
 */
public class NumberCast {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入十六进制字符串：");
        String str = reader.readLine();
        System.out.println(Integer.decode(str));
    }
}
