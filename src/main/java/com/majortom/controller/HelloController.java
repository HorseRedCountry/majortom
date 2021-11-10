package com.majortom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  Hello 控制器
 * </P>
 *
 * @author Major Tom
 * @since 2021/11/9 20:20
 */
@RestController
@RequestMapping("/majortom")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

}
