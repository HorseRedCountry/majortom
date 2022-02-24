package com.majortom.exercise.mytest.java8test.chapter8;

import com.majortom.exercise.mytest.java8test.chapter8.strategy.IsAllLowerCase;
import com.majortom.exercise.mytest.java8test.chapter8.strategy.IsNumeric;
import com.majortom.exercise.mytest.java8test.chapter8.strategy.Validator;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 19:05
 */
public class Chapter8MainClass {
    public static void main(String[] args) {
        //普通模式
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        System.out.println(lowerCaseValidator.validate("asWWWW"));
        Validator isNumbericValidator = new Validator(new IsNumeric());
        System.out.println(isNumbericValidator.validate("123"));
        //Lambda表达式写法
        Validator lambdaIsLowerCaseValidator = new Validator((String a) -> a.matches("[a-z]+"));
        System.out.println(lambdaIsLowerCaseValidator.validate("asdasdas"));
        Validator lambdaIsNumbericValidator = new Validator((String a) -> a.matches("\\d+"));
        System.out.println(lambdaIsNumbericValidator.validate("3445"));
    }
}
