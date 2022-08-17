package com.majortom.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/16 23:02
 */
@SpringBootApplication
@MapperScan("com.majortom.web.mapper")
public class WebDemoMain {
    public static void main(String[] args) {
        SpringApplication.run(WebDemoMain.class, args);
    }
}
