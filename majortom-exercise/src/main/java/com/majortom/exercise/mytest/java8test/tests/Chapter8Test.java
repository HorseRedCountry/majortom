package com.majortom.exercise.mytest.java8test.tests;

import com.majortom.exercise.mytest.java8test.chapter8.lambdatest.Point;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 21:42
 */
public class Chapter8Test {
    public static void main(String[] args) {
        Chapter8Test chapter8Test = new Chapter8Test();
        chapter8Test.testMoveRightBy();
    }

    public void testMoveRightBy(){
        Point p1 = new Point(5, 5);
        Point p2 = p1.moveRightBy(10);
        System.out.println(p2.toString());
    }

}
