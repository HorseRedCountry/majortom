package com.majortom.exercise.mytest.java8test.chapter10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/3 11:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Optional<Car> car;
}
