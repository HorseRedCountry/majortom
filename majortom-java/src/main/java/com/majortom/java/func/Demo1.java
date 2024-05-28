package com.majortom.java.func;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/5/28 9:32
 **/
public class Demo1 {
    public static void main(String[] args) {
        int[] intArray = new int[2];
        intArray[0] = 5;
        intArray[1] = 6;
        System.out.println(Arrays.stream(intArray).sum());
    }
}
