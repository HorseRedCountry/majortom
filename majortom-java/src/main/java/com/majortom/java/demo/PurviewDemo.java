package com.majortom.java.demo;

import java.util.Arrays;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/19 11:07
 **/
public class PurviewDemo {

    public static void main(String[] args) {
//        long[] rawAccessIdArr = new long[]{1211108734, 48367, 0, 0, 235798528, 0, 0, 0, 0, 0};
        long[] rawAccessIdArr = new long[]{1211108734};
        long[] result = untieAccessId(rawAccessIdArr);
        int[] result2 = mergeAccessId(1,27,30);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 获取权限项ID
     *
     * @param accessIds 权限数组
     * @return 权限项ID
     */
    public static long[] untieAccessId(long... accessIds) {
        //按最大值初始化数组，即每一个ID都是32位
        long[] accessIdArr = new long[accessIds.length * 32];
        //k记的是二进制上有值的位数
        int n = 0, k = 0;
        for (long accessId : accessIds) {
            for (int i = 0; i < 32; i++, k++) {
                //&1 判断奇偶：奇数&1=1，偶数&1=0
                if ((accessId & 1) == 1) {
                    //&1为奇数，说明二进制最右边的一位有值
                    accessIdArr[n] = k;
                    n++;
                }
                //右移一位，相当于 整体/2，本质上是一位一位判断
                accessId = accessId >> 1;
            }
        }
        if (n == accessIdArr.length) {
            return accessIdArr;
        }
        long[] result = new long[n];
        System.arraycopy(accessIdArr, 0, result, 0, n);
        return result;
    }

    public static int[] mergeAccessId(int... accessIds) {
        int[] accessIdArr = new int[100];
        int n = 0, k;
        for (int accessId : accessIds) {
            //右移五位，相当于整除2的5次方，即除以32
            k = accessId >> 5;
            //accessIdArr[k] = accessIdArr[k] | (1 << (accessId & 31));
            accessIdArr[k] |= 1 << (accessId & 31);
            if (k > n) {
                n = k;
            }
        }
        if (n == accessIdArr.length) {
            return accessIdArr;
        }
        int[] result = new int[n + 1];
        System.arraycopy(accessIdArr, 0, result, 0, n + 1);
        return result;
    }

    public static boolean isExist(String purviewIds, long... accessIds) {
        String[] purviewIdArr = purviewIds.split(",");
        int[] ids = new int[purviewIdArr.length];
        int n, k;
        for (int i = 0; i < ids.length; i++) {
            ids[i] = Integer.parseInt(purviewIdArr[i]);
            n = ids[i] >> 5;
            k = ids[i] & 31;
            if ((accessIds[n] & k) != k) {
                return false;
            }
        }
        return true;
    }

}
