package com.majortom.java.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Week;

import java.util.Collections;

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
        System.out.println("===============");
        char[] chars = DateUtil.dayOfWeekEnum(DateUtil.date()).toChinese().toCharArray();
        System.out.println(chars[2]);
        System.out.println(DateUtil.dayOfWeekEnum(DateUtil.date()).toChinese().toCharArray()[2]);
        String beginDate = "2022-05-30";
        DateTime dateTime = DateUtil.offsetMonth(DateUtil.parse(beginDate), -1);
        String lastMonthBeginDay = DateUtil.formatDate(DateUtil.beginOfMonth(DateUtil.parse(DateUtil.format(dateTime, "yyyy-MM-dd"))));
        String lastMonthEndDay = DateUtil.formatDate(DateUtil.endOfMonth(DateUtil.parse(DateUtil.format(dateTime, "yyyy-MM-dd"))));
        System.out.println(lastMonthBeginDay);
        System.out.println(lastMonthEndDay);
    }
}
