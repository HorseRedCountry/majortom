package com.majortom.java.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/6/9 10:34
 */
public class DateDemo4 {
    public static void main(String[] args) {
        String yearMonth = "2022-04";
        DateTime monthBegin = DateUtil.parse(yearMonth, "yyyy-MM");
        DateTime begin = DateUtil.beginOfMonth(monthBegin);
        DateTime end = DateUtil.endOfMonth(monthBegin);
        System.out.println(monthBegin);
        System.out.println(begin);
        System.out.println(end);

        System.out.println(new Date(Long.parseLong(String.valueOf(1654099200)) * 1000));
        System.out.println(DateUtil.format(new Date(Long.parseLong(String.valueOf(1654099200)) * 1000), "yyyy-MM-dd"));
        System.out.println(DateUtil.offsetMinute(new Date(Long.parseLong(String.valueOf(1654099200)) * 1000), 510));


        DateTime startDate = DateUtil.parseDate("2022-06-08");
        DateTime endDate = DateUtil.offsetDay(startDate, 1);
        do {
            System.out.println(startDate);
            startDate = DateUtil.offsetDay(startDate, 1);
        } while (startDate.before(endDate));

        System.out.println("==============================");
        System.out.println(DateUtil.date());
        System.out.println("天" + "\n" + "地");
    }
}
