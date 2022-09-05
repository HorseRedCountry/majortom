package com.majortom.java.demo;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/22 10:35
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> strList = Lists.newArrayList();
        strList.add("eqweqewq");
        strList.add("dsfafsd-dd");
        strList.add("sdfsddf.jpg");
        String s = strList.toString();
        String s2 = JSONUtil.toJsonStr(strList);
        String s3 = StrUtil.join(";", strList);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("********************************");
        String splitStr = "5";
        String[] split = splitStr.split(",");
        for (String s5 : split) {
            System.out.println("********************************");
            System.out.println(s5);
            System.out.println("********************************");
        }
        System.out.println("********************************");
    }
}
