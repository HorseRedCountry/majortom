package com.majortom.algorithm.chapter1;

import java.util.Arrays;

/**
 * <p>
 * 根据数组中的值创建一个集合
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/14 7:09
 */
public class StaticSetofInts {
    private int[] a;

    public StaticSetofInts(int[] keys) {
        a = new int[keys.length];
        System.arraycopy(keys, 0, a, 0, keys.length);
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    /**
     * 二分查找 数据在数组中的位置
     *
     * @param key 数据
     * @return 位置
     */
    private int rank(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
