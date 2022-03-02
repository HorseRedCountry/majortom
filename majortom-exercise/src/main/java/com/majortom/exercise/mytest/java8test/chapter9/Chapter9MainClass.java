package com.majortom.exercise.mytest.java8test.chapter9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 22:19
 */
public class Chapter9MainClass {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 5, 1, 2, 6);
        numberList.sort(Comparator.naturalOrder());
        System.out.println(numberList);
    }
}
