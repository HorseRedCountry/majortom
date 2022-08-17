package com.majortom.web.controller;

import com.majortom.web.PageVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

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

    public PageVo queryPage(@RequestParam(required = false) Integer currentPage,
                            @RequestParam(required = false) Integer pageSize) {
        return null;
    }

}
