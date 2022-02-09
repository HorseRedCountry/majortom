package com.majortom.exercise.mytest.java8test.chapter2;

import com.majortom.exercise.mytest.java8test.chapter2.entity.Trader;
import com.majortom.exercise.mytest.java8test.chapter2.entity.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/8 18:08
 */
public class Chapter2MainClass {
    public static void main(String[] args) {
        List<Integer> numberArr = Arrays.asList(1, 2, 4, 5, 6);
        List<Integer> result = numberArr.stream()
                .map(x -> x * x)
                .collect(toList());
        System.out.println(result);

        List<Integer> numberArr1 = Arrays.asList(1, 2, 4);
        List<Integer> numberArr2 = Arrays.asList(5, 6);
        List<int[]> collect = numberArr1.stream()
                .flatMap(i -> numberArr2.stream().map(j -> new int[]{i, j}))
                .collect(toList());
        collect.forEach(x -> System.out.println(Arrays.toString(x)));

        Integer sumResult = numberArr.stream().reduce(0, Integer::sum);
        System.out.println("sumResult is: " + sumResult);
        Optional<Integer> maxResult = numberArr.stream().reduce(Integer::max);

        //测试数据
        Trader raoul=new Trader("Raoul","Cambridge");
        Trader mario=new Trader("Mario","Milan");
        Trader alan=new Trader("Alan","Cambridge");
        Trader brian=new Trader("Brian","Cambridge");

        List<Transaction> transactions=Arrays.asList(
          new Transaction();
        );

    }
}
