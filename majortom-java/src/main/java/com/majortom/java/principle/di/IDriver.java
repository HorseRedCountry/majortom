package com.majortom.java.principle.di;

/**
 * <p>
 * 驾驶员 通用接口
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/27 15:02
 */
public interface IDriver {
    /**
     * 驾驶汽车
     *
     * @param car 汽车
     */
    void drive(ICar car);
}
