package com.majortom.java.files;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * 读取配置文件Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/14 11:20
 **/
public class LoadPropertyDemo {
    public static void main(String[] args) throws IOException {
        LoadPropertyDemo loadPropertyDemo = new LoadPropertyDemo();
        Properties properties = new Properties();
        InputStream input = loadPropertyDemo.getClass().getClassLoader().getResourceAsStream("IKAnalyzer.cfg.xml");
        if (null != input) {
            properties.loadFromXML(input);
            System.out.println(properties);
        }
    }
}
