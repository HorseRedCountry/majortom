/**
 * 2011-01-11
 */
package com.majortom.java.security.coder;


import com.majortom.java.security.SecurityCoder;

/**
 * SHA加密组件
 *
 * @author ShenHuaJie
 * @version 1.0
 * @since 1.0
 */
public abstract class SHACoder extends SecurityCoder {

    /**
     * SHA-1加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA(String data) throws Exception {
        return digest("SHA", data);
    }

    /**
     * SHA-1加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA1(String data) throws Exception {
        return digest("SHA-1", data);
    }

    /**
     * SHA-256加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA256(String data) throws Exception {
        return digest("SHA-256", data);
    }

    /**
     * SHA-384加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA384(String data) throws Exception {
        return digest("SHA-384", data);
    }

    /**
     * SHA-512加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA512(String data) throws Exception {
        return digest("SHA-512", data);
    }

    /**
     * SHA-224加密
     *
     * @param data 待加密数据
     * @return String 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA224(String data) throws Exception {
        return digest("SHA-224", data);
    }
}
