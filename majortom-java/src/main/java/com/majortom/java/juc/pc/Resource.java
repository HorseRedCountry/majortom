package com.majortom.java.juc.pc;

import cn.hutool.core.collection.CollectionUtil;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>
 * 资源
 * </p>
 *
 * @author Major Tom
 * @date 2023/12/28 10:58
 **/
public class Resource {

    /**
     * 资源的最大数量
     */
    private static final int MAX_COUNT = 10;
    /**
     * 所有资源
     */
    private static final List<String> RESOURCE_LIST = Lists.newArrayList();

    public synchronized static void produceResource() throws FullResourcesException {
        if (RESOURCE_LIST.size() == MAX_COUNT) {
            throw new FullResourcesException("资源池已经满了......");
        }
        String str = System.currentTimeMillis() + "-----编号 " + RESOURCE_LIST.size();
        RESOURCE_LIST.add(str);
        System.out.println("生产了一个新资源：" + str + "，目前资源池中资源个数为：" + RESOURCE_LIST.size() + " ,当前线程为：" + Thread.currentThread().getName());
    }

    public synchronized static void consumeResource() throws NoResourceException {
        if (CollectionUtil.isEmpty(RESOURCE_LIST)) {
            throw new NoResourceException("资源池中没有资源了......");

        }
        String str = RESOURCE_LIST.get(RESOURCE_LIST.size() - 1);
        RESOURCE_LIST.remove(RESOURCE_LIST.size() - 1);
        System.out.println("消费了一个新资源：" + str + "，目前资源池中资源个数为：" + RESOURCE_LIST.size() + " ,当前线程为：" + Thread.currentThread().getName());
    }

}
