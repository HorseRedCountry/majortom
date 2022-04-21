package com.majortom.java.principle.lsp.designbycontract;

import java.util.Collection;
import java.util.HashMap;

/**
 * <p>
 *  契约设计--父类
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/21 12:27
 */
public class DcFather {
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行......");
        return map.values();
    }
}
