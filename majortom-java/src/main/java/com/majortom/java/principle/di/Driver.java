package com.majortom.java.principle.di;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/27 15:03
 */
public class Driver implements IDriver{
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
