package com.majortom.java.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>
 * 字符串替换Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/11/29 21:09
 **/
public class StringReplaceDemo {

    public static void main(String[] args) {
        String rawStr = "测试用例子；测试对象类；1123测试；今天是个好日子；需要进行一些简单的测试然后再去验证";
        String searchStr = "测试";
        List<String> result = Lists.newArrayList();
        for (String str : rawStr.split("；")) {
            if (str.contains(searchStr)) {
                String[] split = str.split(searchStr);
                for (String s : split) {
                    System.out.println(s);
                }
            }
        }
    }

}
