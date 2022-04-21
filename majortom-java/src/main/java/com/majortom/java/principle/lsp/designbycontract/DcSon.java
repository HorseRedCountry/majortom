package com.majortom.java.principle.lsp.designbycontract;

import java.util.Collection;
import java.util.Map;

/**
 * <p>
 * 契约设计--子类
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/21 12:29
 */
public class DcSon extends DcFather {
    /**
     * 放大输入参数类型
     *
     * @param map /
     * @return /
     */
    public Collection doSomething(Map map) {
        System.out.println("子类被执行......");
        return map.values();
    }

}
