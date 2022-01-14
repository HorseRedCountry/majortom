package com.majortom.exercise.mytest.java8test.chapter1;

import com.majortom.exercise.mytest.java8test.chapter1.entity.Apple;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.AppleFormatter;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.ApplePredicate;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.impl.AppleColorFormatter;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.impl.AppleGreenPredicate;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.impl.AppleHeavyPredicate;
import com.majortom.exercise.mytest.java8test.chapter1.predicates.impl.AppleRedPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/1/14 9:59
 */
public class Chapter1MainClass {
    public static void main(String[] args) {
        Apple a=Apple.builder()
                .color("red")
                .weight(80)
                .build();
        Apple b=Apple.builder()
                .color("red")
                .weight(180)
                .build();
        Apple c=Apple.builder()
                .color("green")
                .weight(150)
                .build();
        Apple d=Apple.builder()
                .color("green")
                .weight(90)
                .build();
        Apple e=Apple.builder()
                .color("red")
                .weight(90)
                .build();
        List<Apple> appleList = new ArrayList<>();
        appleList.add(a);
        appleList.add(b);
        appleList.add(c);
        appleList.add(d);
        appleList.add(e);
        List<Apple> redList = filterApples(appleList, new AppleRedPredicate());
        redList.forEach(apple-> System.out.println(apple.toString()));
        System.out.println("===================================================");
        List<Apple> greenList = filterApples(appleList, new AppleGreenPredicate());
        greenList.forEach(apple-> System.out.println(apple.toString()));
        System.out.println("===================================================");
        List<Apple> heavyList = filterApples(appleList, new AppleHeavyPredicate());
        heavyList.forEach(apple-> System.out.println(apple.toString()));
        System.out.println("===================================================");
        prettyPrintApple(appleList,new AppleColorFormatter());
    }

    public static List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate){
        List<Apple> resultList=new ArrayList<>();
        appleList.forEach(apple->{
            if (predicate.predicate(apple)){
                resultList.add(apple);
            }
        });
        return resultList;
    }

    public static void prettyPrintApple(List<Apple> appleList, AppleFormatter formatter){
        appleList.forEach(apple -> {
            System.out.println(formatter.format(apple));
        });
    }

}
