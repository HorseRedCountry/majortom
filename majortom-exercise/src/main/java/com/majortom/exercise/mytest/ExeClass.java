package com.majortom.exercise.mytest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 启动类
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/12 19:41
 */
public class ExeClass {
    public static void main(String[] args) {
        Apple a = Apple.builder()
                .color("red")
                .name("张三")
                .year(28)
                .build();
        Apple b = Apple.builder()
                .color("green")
                .name("李四")
                .year(10)
                .build();
        Apple c = Apple.builder()
                .color("red")
                .name("王五")
                .year(18)
                .build();
        List<Apple> appleList = new ArrayList<>();
        appleList.add(a);
        appleList.add(b);
        appleList.add(c);
        appleList.sort(Comparator.comparing(Apple::getColor).thenComparing(Apple::getYear));
        appleList.forEach(apple -> System.out.println(apple.toString()));
        System.out.println("===========================================");
        List<Apple> resultList = appleList.stream().filter(apple -> apple.getColor().equals("red")).collect(Collectors.toList());
        Apple result = appleList.stream().filter(apple -> apple.getColor().equals("red")).findFirst().orElse(null);
        System.out.println(result == null ? "没有啊" : result.toString());
        System.out.println("===========================================");
        resultList.forEach(apple -> System.out.println(apple.toString()));
    }
}

