package com.majortom.java.date;

import cn.hutool.core.date.DateUtil;

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
    }
}
