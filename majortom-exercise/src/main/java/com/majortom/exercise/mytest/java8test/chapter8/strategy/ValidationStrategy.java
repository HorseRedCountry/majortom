package com.majortom.exercise.mytest.java8test.chapter8.strategy;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 19:06
 */
public interface ValidationStrategy {

    /**
     * 验证输入的字符串是否按照要求进行了格式化
     *
     * @param s 字符串
     * @return 验证结果
     */
    boolean execute(String s);

}
