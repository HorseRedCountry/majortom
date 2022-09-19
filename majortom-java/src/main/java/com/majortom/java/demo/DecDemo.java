package com.majortom.java.demo;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/19 13:47
 */
public class DecDemo {
    public static void main(String[] args) {

        String s="";

        String deDec=CryptUtils.decryptDes(s);

        System.out.println(deDec);
    }
}
