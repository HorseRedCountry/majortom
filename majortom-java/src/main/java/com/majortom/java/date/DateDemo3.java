package com.majortom.java.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/17 10:18
 */
public class DateDemo3 {
    public static void main(String[] args) {
        String yearMonth="2022-03";
        String formatDate = yearMonth + "-01 00:00:00";
        DateTime dateTime = DateUtil.parse(formatDate);
        //月起始和月结束
        DateTime beginOfMonth = DateUtil.beginOfMonth(dateTime);
        DateTime endOfMonth = DateUtil.endOfMonth(dateTime);
        System.out.println(beginOfMonth);
        System.out.println(endOfMonth);
        Set<String> dayDateSet=new HashSet<>();
        dayDateSet.add("2022-03-05");
        dayDateSet.add("2022-03-15");
        dayDateSet.add("2022-03-25");
        dayDateSet.add("2022-03-01");
        dayDateSet.add("2022-03-03");
        dayDateSet.forEach(System.out::println);
        List<String> dayDateList = dayDateSet.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        dayDateList.forEach(System.out::println);
    }
}
