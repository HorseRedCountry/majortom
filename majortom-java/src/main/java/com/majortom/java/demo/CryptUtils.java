package com.majortom.java.demo;

import com.majortom.java.security.BASE64Encoder;
import com.majortom.java.security.Hex;
import com.majortom.java.security.coder.*;

import java.util.Map;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/19 13:58
 */
public class CryptUtils {
    private static final byte[] ENCRYPT_KEY = new byte[]{116, 111, 110, 115, 97, 105, 108, 64, 50, 49, 53, 56};
    public static final String UTF8 = "UTF-8";

    private CryptUtils() {
    }

    public static final byte[] decryptBASE64(String str) {
        try {
            return (new BASE64Encoder()).decode(str);
        } catch (Exception var2) {
            throw new RuntimeException("解密错误，错误信息：", var2);
        }
    }

    public static final String encryptBASE64(byte[] str) {
        try {
            return (new BASE64Encoder()).encode(str);
        } catch (Exception var2) {
            throw new RuntimeException("加密错误，错误信息：", var2);
        }
    }

    public static final String decryptDes(String cryptData) {
        return decryptDes(cryptData, ENCRYPT_KEY);
    }

    public static final String encryptDes(String data) {
        return encryptDes(data, ENCRYPT_KEY);
    }

    public static final String encryptMd5(String strSrc) {
        String outString = null;

        try {
            outString = encryptBASE64(MDCoder.encodeMD5(strSrc));
            return outString;
        } catch (Exception var3) {
            throw new RuntimeException("加密错误，错误信息：", var3);
        }
    }

    public static final String md5(String strSrc) {
        String outString = null;

        try {
            outString = Hex.encodeHexString(MDCoder.encodeMD5(strSrc));
            return outString;
        } catch (Exception var3) {
            throw new RuntimeException("加密错误，错误信息：", var3);
        }
    }

    public static final String encryptSHA(String data) {
        try {
            return encryptBASE64(SHACoder.encodeSHA256(data));
        } catch (Exception var2) {
            throw new RuntimeException("加密错误，错误信息：", var2);
        }
    }

    public static final String decryptDes(String cryptData, byte[] key) {
        String decryptedData = null;

        try {
            decryptedData = new String(DESCoder.decrypt(decryptBASE64(cryptData), key));
            return decryptedData;
        } catch (Exception var4) {
            throw new RuntimeException("解密错误，错误信息：", var4);
        }
    }

    public static final String encryptDes(String data, byte[] key) {
        String encryptedData = null;

        try {
            encryptedData = encryptBASE64(DESCoder.encrypt(data.getBytes(), key));
            return encryptedData;
        } catch (Exception var4) {
            throw new RuntimeException("加密错误，错误信息：", var4);
        }
    }

    public static final String signRSA(String data, String privateKey) {
        try {
            return encryptBASE64(RSACoder.sign(data.getBytes("UTF-8"), decryptBASE64(privateKey)));
        } catch (Exception var3) {
            throw new RuntimeException("签名错误，错误信息：", var3);
        }
    }

    public static final boolean verifyRSA(String data, String publicKey, String sign) {
        try {
            return RSACoder.verify(data.getBytes("UTF-8"), decryptBASE64(publicKey), decryptBASE64(sign));
        } catch (Exception var4) {
            throw new RuntimeException("验签错误，错误信息：", var4);
        }
    }

    public static final String encryptRSAPrivate(String data, String privateKey) {
        try {
            return encryptBASE64(RSACoder.encryptByPrivateKey(data.getBytes("UTF-8"), decryptBASE64(privateKey)));
        } catch (Exception var3) {
            throw new RuntimeException("解密错误，错误信息：", var3);
        }
    }

    public static final String decryptRSAPublic(String cryptData, String publicKey) {
        try {
            return new String(RSACoder.decryptByPublicKey(decryptBASE64(cryptData), decryptBASE64(publicKey)));
        } catch (Exception var3) {
            throw new RuntimeException("解密错误，错误信息：", var3);
        }
    }

    public static final String initHmacKey(String type) {
        try {
            return encryptBASE64(HmacCoder.initHmacKey(type));
        } catch (Exception var2) {
            throw new RuntimeException("获取HMAC密钥失败：", var2);
        }
    }

    public static final String encryptHMAC(String type, String data, String key) {
        try {
            return HmacCoder.encodeHmacHex(type, data.getBytes("UTF-8"), decryptBASE64(key));
        } catch (Exception var4) {
            throw new RuntimeException("加密错误，错误信息：", var4);
        }
    }

    public static String encryptPassword(String password) {
        return encryptMd5(encryptSHA(password));
    }

    public static void main(String[] args) throws Exception {
        String data = "{\"row_index\":0,\"Salary_001\":\"1\",\"Salary_002\":\"硬件开发部\",\"Salary_003\":\"Java工程师\",\"Salary_004\":\"HZ0024\",\"Salary_005\":\"郑阳结\",\"Salary_006\":\"15375188529\",\"Salary_007\":\"1000000.1\",\"Salary_008\":\"20000\",\"Salary_009\":\"9999\",\"Salary_010\":\"4999\",\"Salary_011\":\"85\",\"Salary_012\":\"80\",\"Salary_013\":\"5000\",\"Salary_014\":\"50000\",\"Salary_015\":\"4000\",\"Salary_016\":\"2019\",\"Salary_017\":\"2000\",\"Salary_018\":\"8000\",\"Salary_019\":\"1000000\",\"Salary_020\":\"24\",\"Salary_021\":\"0\",\"Salary_022\":\"20\",\"Salary_023\":\"23\",\"Salary_024\":\"1000000\",\"Salary_025\":\"3\",\"Salary_026\":\"22\",\"Salary_027\":\"323\",\"Salary_028\":\"21\",\"Salary_029\":\"322\",\"Salary_030\":\"321\",\"Salary_031\":\"320\",\"Salary_032\":\"232\",\"Salary_033\":\"311\",\"Salary_034\":\"316\",\"Salary_035\":\"315\",\"Salary_036\":\"314\",\"Salary_037\":\"313\",\"Salary_038\":\"312\",\"Salary_039\":\"2000000.01\"}";
        String _data = encryptDes(data);
        System.out.println(_data);
        System.out.println(decryptDes(_data));
        System.out.println(encryptDes("SHJR"));
        System.out.println(decryptDes("INzvw/3Qc4q="));
        System.out.println(encryptMd5("SHJR"));
        System.out.println(encryptSHA("1"));
        Map<String, Object> key = RSACoder.initKey();
        String privateKey = encryptBASE64(RSACoder.getPrivateKey(key));
        String publicKey = encryptBASE64(RSACoder.getPublicKey(key));
        System.out.println(privateKey);
        System.out.println(publicKey);
        String sign = signRSA("132", privateKey);
        System.out.println(sign);
        String encrypt = encryptRSAPrivate("132", privateKey);
        System.out.println(encrypt);
        String org = decryptRSAPublic(encrypt, publicKey);
        System.out.println(org);
        System.out.println(verifyRSA(org, publicKey, sign));
    }
}
