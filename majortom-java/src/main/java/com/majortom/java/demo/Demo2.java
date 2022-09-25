package com.majortom.java.demo;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/25 21:44
 */
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s3);
    }
}
