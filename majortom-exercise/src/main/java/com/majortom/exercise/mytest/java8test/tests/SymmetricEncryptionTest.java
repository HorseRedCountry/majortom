package com.majortom.exercise.mytest.java8test.tests;

/**
 * <p>
 * 对称加密测试
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/21 18:05
 */
public class SymmetricEncryptionTest {
    public static void main(String[] args) {
        String input = "I love you,方大醒同志";
        System.out.println("明文为：" + input);
        String dText = symmetricEncryption(input, 3);
        System.out.println("密文为：" + dText);
        String result = decrypt(dText, 3);
        System.out.println("解密结果为：" + result);
    }

    /**
     * 对称加密
     *
     * @param input  明文
     * @param offset 偏移量
     * @return 密文
     */
    public static String symmetricEncryption(String input, int offset) {
        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + offset);
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    /**
     * 解密
     *
     * @param cipherText 密文
     * @param offset     偏移量
     * @return 明文
     */
    public static String decrypt(String cipherText, int offset) {
        char[] chars = cipherText.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - offset);
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

}
