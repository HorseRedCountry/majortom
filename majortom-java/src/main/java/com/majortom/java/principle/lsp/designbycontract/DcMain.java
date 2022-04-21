package com.majortom.java.principle.lsp.designbycontract;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * <p>
 *  契约设计
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/21 12:32
 */
public class DcMain {
    public static void main(String[] args) {
        invoker();
    }

    public static void invoker() {
        //DcFather father = new DcFather();
        DcSon son=new DcSon();
        HashMap map = Maps.newHashMap();
        son.doSomething(map);
    }
}
