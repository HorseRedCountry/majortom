package com.majortom.java.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/6/26 14:34
 **/
public class Demo1Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Demo1 demo1 = new Demo1();
        oos.writeObject(demo1);
        oos.flush();
        oos.close();
    }
}
