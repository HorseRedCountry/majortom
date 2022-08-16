package com.majortom.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/16 23:14
 */
@RestController
@RequestMapping("/demo")
public class WebController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello!";
    }

}
