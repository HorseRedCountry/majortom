package com.majortom.java.principle.factory;

/**
 * <p>
 * 抽象工厂类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/27 12:29
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * <p>
     * 通常为String、Enum、Class等，当然也可以为空
     *
     * @param t   参数
     * @param <T> 产品对象
     * @return 创建好的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> t);

}
