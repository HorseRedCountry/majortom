package com.majortom.java.demo;


import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/26 14:55
 **/
public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] arr1=new String[]{"1","2","3"};
        String[] arr2=new String[]{"4","5","6"};
        int l1=arr1.length;
        int l2=arr2.length;
        arr1= Arrays.copyOf(arr1,l1+l2);
        System.arraycopy(arr2,0,arr1,l1,l2);
        System.out.println("====================");
    }
}
