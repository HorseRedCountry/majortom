package com.majortom.exercise.mytest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 *  启动类
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/12 19:41
 */
public class ExeClass {
    public static void main(String[] args){
        Apple a=Apple.builder()
                .color("red")
                .name("张三")
                .year(13)
                .build();
        Apple b=Apple.builder()
                .color("green")
                .name("李四")
                .year(10)
                .build();
        List<Apple> appleList=new ArrayList<>();
        appleList.add(a);
        appleList.add(b);
        appleList.sort(Comparator.comparing(Apple::getYear));
        appleList.forEach(apple-> System.out.println(apple.toString()));
    }
}

