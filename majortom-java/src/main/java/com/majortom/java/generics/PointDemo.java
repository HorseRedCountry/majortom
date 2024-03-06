package com.majortom.java.generics;

/**
 * <p>
 * 泛型Demo1
 * </p>
 *
 * @author Major Tom
 * @date 2024/3/6 16:58
 **/
class Point<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point<String> p = new Point<>();
        p.setVar("Demo");
        System.out.println(p.getVar().length());
    }
}
