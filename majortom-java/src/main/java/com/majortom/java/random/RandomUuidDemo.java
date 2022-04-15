package com.majortom.java.random;

import cn.hutool.core.lang.UUID;

/**
 * <p>
 *  生成UUID
 * </P>
 *
 * @author Major Tom
 * @since 2022/4/15 15:06
 */
public class RandomUuidDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            String uuid=UUID.fastUUID().toString();
            System.out.println(uuid.replaceAll("-",""));
        }
    }
}
