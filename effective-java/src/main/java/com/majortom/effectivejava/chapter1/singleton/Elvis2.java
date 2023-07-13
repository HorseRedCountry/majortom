package com.majortom.effectivejava.chapter1.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/13 21:54
 **/
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        if (null != INSTANCE) {
            throw new RuntimeException("对象已创建！");
        } else {
            System.out.println("Elvis2 created");
        }
    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis leave");
    }
}
