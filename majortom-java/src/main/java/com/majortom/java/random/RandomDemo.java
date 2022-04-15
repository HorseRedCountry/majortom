package com.majortom.java.random;

import cn.hutool.core.util.RandomUtil;

/**
 * <p>
 *  随机相关Demo
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/11 13:41
 */
public class RandomDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            sb.append(RandomUtil.randomInt(10));
        }
        System.out.println(sb);
        String result=String.format("%s%s","test_string","0225");
        System.out.println(result);
    }
}
