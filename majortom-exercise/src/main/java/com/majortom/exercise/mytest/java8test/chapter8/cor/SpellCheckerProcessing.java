package com.majortom.exercise.mytest.java8test.chapter8.cor;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 12:20
 */
public class SpellCheckerProcessing extends ProcessingObject<String> {
    @Override
    protected String handWork(String text) {
        return text.replaceAll("labda", "lambda");
    }
}
