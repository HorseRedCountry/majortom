package com.majortom.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/8 15:19
 */
@RestController
@RequestMapping(value="/hellodemo")
public class UserController {

    @GetMapping(value="/hello")
    public String hello(){
        return "Hello World!";
    }

}
