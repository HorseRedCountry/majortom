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

    private static Calculator cal;

    public static void test(Calculator calculator){
        cal=calculator;
    }

    static class Calculator$1 implements Calculator{

        @Override
        public int calculate() {
            System.out.println("执行Calculate方法...");
            return 1;
        }
    }

    public static void main(String[] args) {
        test(new Calculator$1());
        cal.calculate();
    }

}
