package com.majortom.security.common;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Duration;
import java.util.Date;

/**
 * <p>
 * Jwt工具类
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/24 22:06
 */
public final class JwtUtil {
    /**
     * 防止Jwt被篡改的秘钥
     */
    private final static String SECRET_KEY = "whatever";
    /**
     * 设置过期时间为两天
     */
    private final static Duration EXPIRATION = Duration.ofHours(2);

    /**
     * 生成Jwt
     *
     * @param userName 用户名
     * @return 生成的Jwt字符串
     */
    public static String generate(String userName) {
        //过期时间
        Date expritionDate = new Date(System.currentTimeMillis() + EXPIRATION.toMillis());
        return Jwts.builder()
                .setSubject(userName)
                //设置Jwt签发时间
                .setIssuedAt(new Date())
                //设置过期时间
                .setExpiration(expritionDate)
                //设置加密算法和秘钥
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    /**
     * 解析Jwt
     * @param token Jwt字符串
     * @return 解析成功返回Claims对象；解析失败则返回null
     */
    public static Claims parse(String token){
        if (null==token){
            return null;
        }
        //Claims对象包含了签发时间、过期时间以及存放的数据等众多属性
        Claims claims=null;
        try {
            claims=Jwts.parser()
                    //设置秘钥
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token)
                    .getBody();
        }catch(JwtException e){
            System.err.println("解析失败！");
        }
        return claims;
    }
}
