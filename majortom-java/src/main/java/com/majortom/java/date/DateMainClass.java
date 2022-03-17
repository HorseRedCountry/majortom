package com.majortom.java.date;

import cn.hutool.core.date.DateUtil;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/16 15:40
 */
public class DateMainClass {
    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println(now);
        String[] dateArr = now.split(" ");
        for (int i = 0; i < dateArr.length; i++) {
            System.out.println("dateArr[" + i + "] is " + dateArr[i]);
        }
    }
}
