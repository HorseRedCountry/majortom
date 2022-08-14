package com.majortom.java.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/28 10:52
 */
public class DateDemo2 {
    public static void main(String[] args) {
        String date = DateUtil.format(DateUtil.yesterday(), "yyyy-MM-dd");
        System.out.println(date);
        String ids=",149,673,744,194,2,448,6644,196,534,6699,7321,7332,7976,8043,8090,";
        String[] split = ids.split(",");
        for (String id : split) {
            System.out.println(id);
        }
        System.out.println(ids.substring(1));
        List<String> strings = Arrays.asList(split);
        System.out.println(strings);
        System.out.println("===============================================");
        //String now = DateUtil.now();
        System.out.println(DateUtil.format(DateUtil.date(),"yyyy-MM"));
        DateTime spStartTime = DateUtil.parse("2022-06-06 08:30:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println(DateUtil.format(spStartTime, "yyyy-MM-dd"));

        System.out.println("=====================================");
        System.out.println(DateUtil.endOfMonth(DateUtil.parse("2022-07","yyyy-MM")));
        System.out.println("=====================================");
        System.out.println(DateUtil.formatDate(DateUtil.lastMonth()));

        System.out.println(DateUtil.month(DateUtil.date()));

        System.out.println(StrUtil.sub("胡蕾慧15618202757".trim(),0,3));


    }
}
