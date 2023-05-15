package com.majortom.java.func;

import java.util.function.BiConsumer;

/**
 * <p>
 * BiCosnsumer Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/5/15 9:35
 **/
public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String, String> consumer = (a, b) -> {
            System.out.println(a + "------" + b);
        };
        consumer.accept("Major", "Tom");
        BiConsumer<Integer, Integer> addition = (a, b) -> {
            System.out.println(a + b);
        };
        BiConsumer<Integer, Integer> subtraction = (a, b) -> {
            System.out.println(a - b);
        };
        addition.andThen(subtraction).accept(6, 7);
    }
}
