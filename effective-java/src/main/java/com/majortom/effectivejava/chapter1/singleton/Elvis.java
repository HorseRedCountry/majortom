package com.majortom.effectivejava.chapter1.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/13 21:38
 **/
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        if (null != INSTANCE) {
            throw new RuntimeException("对象已创建！");
        } else {
            System.out.println("Elvis created");
        }
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis leave");
    }

}
