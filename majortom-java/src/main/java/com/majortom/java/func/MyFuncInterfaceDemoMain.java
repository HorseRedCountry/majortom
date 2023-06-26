package com.majortom.java.func;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/6/15 12:02
 **/
public class MyFuncInterfaceDemoMain {
    public static void main(String[] args) {
        MyFuncInterfaceDemo1 demo1=()-> System.out.println("Hello Lambda!");
        demo1.sayHell();
    }
}
