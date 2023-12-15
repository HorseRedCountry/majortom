package com.majortom.java.jvm;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/12/14 19:06
 **/
public class Demo1 {
    public static void main(String[] args) {
        RuntimeMXBean beans = ManagementFactory.getRuntimeMXBean();
        long uptime = beans.getUptime();
        System.out.println(beans.getName());
        System.out.println("JVM已经运行了：" + uptime / 1000 + "秒");
        List<String> inputArguments = beans.getInputArguments();
        for (String inputArgument : inputArguments) {
            System.out.println("JVM参数：" + inputArgument);
        }
        uptime = beans.getUptime();
        System.out.println("JVM已经运行了：" + uptime / 1000 + "秒");
    }
}
