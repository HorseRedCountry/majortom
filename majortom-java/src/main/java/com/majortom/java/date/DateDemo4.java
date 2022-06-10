package com.majortom.java.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

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
        String yearMonth="2022-04";
        DateTime monthBegin = DateUtil.parse(yearMonth,"yyyy-MM");
        DateTime begin = DateUtil.beginOfMonth(monthBegin);
        DateTime end = DateUtil.endOfMonth(monthBegin);
        System.out.println(monthBegin);
        System.out.println(begin);
        System.out.println(end);

    }
}
