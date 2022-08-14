package com.majortom.algorithm.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <p>
 * 白名单
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/14 7:18
 */
public class WhiteList {
    public static void main(String[] args) {
        int[] ints = new In("D:\\myProjects\\majortom\\majortom-algorithm\\src\\main\\resources\\testArr.txt").readAllInts();
        StaticSetofInts set = new StaticSetofInts(ints);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
