package com.majortom.exercise.mytest.java8test.chapter8.cor;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 12:21
 */
public class CorMainClass {
    public static void main(String[] args) {
        //1.常规模式
        HeaderTextProcessing headerTextProcessing = new HeaderTextProcessing();
        SpellCheckerProcessing spellCheckerProcessing = new SpellCheckerProcessing();
        headerTextProcessing.setSuccessor(spellCheckerProcessing);
        String result = headerTextProcessing.handle("Aren't labdas really sexy?");
        System.out.println(result);
        //2.使用Lambda表达式
        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul,Mario and Alan: " + text;
        UnaryOperator<String> spellProcessing = (String text) -> text.replaceAll("labda", "lambda");
        Function<String, String> pipeline = headerProcessing.andThen(spellProcessing);
        String lambdaResult = pipeline.apply("Aren't labdas really sexy?");
        System.out.println(lambdaResult);
    }
}
