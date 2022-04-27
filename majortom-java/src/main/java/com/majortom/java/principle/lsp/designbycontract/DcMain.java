package com.majortom.java.principle.lsp.designbycontract;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

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

        Map<Long,String> testMap=Maps.newHashMap();
        testMap.put(1L,"哈哈哈");
        System.out.println(testMap.get(2L));
    }
}
