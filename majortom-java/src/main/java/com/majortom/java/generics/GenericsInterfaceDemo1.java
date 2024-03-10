package com.majortom.java.generics;

/**
 * <p>
 * 泛型接口Demo
 * </p>
 *
 * @author Major Tom
 * @date 2024/3/10 22:08
 **/
public class GenericsInterfaceDemo1 {
    public static void main(String[] args) {
        Info<String> info = null;
        info = new InfoImpl<>("Major Tom");
        System.out.println("内容：" + info.getInfo());
    }
}

interface Info<T> {
    T getInfo();
}

/**
 * 泛型接口实现类
 *
 * @param <T>
 */
class InfoImpl<T> implements Info<T> {

    private T info;

    public InfoImpl(T info) {
        this.setInfo(info);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public T getInfo() {
        return this.info;
    }
}
