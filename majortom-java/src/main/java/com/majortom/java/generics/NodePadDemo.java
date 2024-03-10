package com.majortom.java.generics;

import javax.xml.soap.Node;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/3/10 22:02
 **/
public class NodePadDemo {
    public static void main(String[] args) {
        NodePad<String, Integer> t = null;
        t = new NodePad<String, Integer>();
        t.setKey("Major Tom");
        t.setValue(28);
        System.out.println("姓名：" + t.getKey());
        System.out.println("年龄：" + t.getValue());
    }
}

class NodePad<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


