package com.majortom.exercise.mytest.java8test.chapter5;

import com.majortom.exercise.mytest.java8test.chapter5.entiy.TernaryNumber;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <p>
 * 求三元数：a*a+b*b=c*c
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/21 13:13
 */
public class Chapter5MainClass {
    public static void main(String[] args) {
        List<TernaryNumber> collect = IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(x -> IntStream.rangeClosed(x, 100)
                        .mapToObj(y -> new TernaryNumber(x, y, Math.sqrt(x * x + y * y)))
                        .filter(t -> t.getC() % 1 == 0))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
