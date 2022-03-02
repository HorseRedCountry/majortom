package com.majortom.exercise.mytest.java8test.chapter8.lambdatest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 21:38
 */
@Data
@Getter
@AllArgsConstructor
public class Point {

    private final int x;

    private final int y;

    public Point moveRightBy(int x) {
        return new Point(this.x + x, this.y);
    }

}
