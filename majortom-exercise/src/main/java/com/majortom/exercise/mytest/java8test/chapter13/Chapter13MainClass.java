package com.majortom.exercise.mytest.java8test.chapter13;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/4 10:56
 */
public class Chapter13MainClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 9);
        List<List<Integer>> result = subsets(list);
        System.out.println(result);
    }

    static List<List<Integer>> subsets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> ans = Lists.newArrayList();
            ans.add(Collections.emptyList());
            return ans;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1, list.size());

        List<List<Integer>> subans = subsets(rest);
        List<List<Integer>> subans2 = insertAll(first, subans);
        return concat(subans, subans2);
    }

    private static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
        List<List<Integer>> r = Lists.newArrayList(a);
        r.addAll(b);
        return r;
    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> lists) {
        List<List<Integer>> result = Lists.newArrayList();
        for (List<Integer> list : lists) {
            List<Integer> copyList = Lists.newArrayList();
            copyList.add(first);
            copyList.addAll(list);
            result.add(copyList);
        }
        return result;
    }
}
