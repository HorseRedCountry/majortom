package com.majortom.security.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.majortom.security.common.JwtUtil;
import com.majortom.security.entity.Person;
import com.majortom.security.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * Jwt登录验证控制器
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/24 22:25
 */
@RestController
@RequestMapping(value = "/Jwt")
public class JwtController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public String loign(@RequestBody Person user) {
        Person person = userService.getOne(
                new LambdaQueryWrapper<Person>()
                        .eq(Person::getUsername, user.getUsername())
                        .eq(Person::getPassword, user.getPassword())
        );
        if (null == person) {
            return "登录失败：用户名或者密码错误！";
        }
        return JwtUtil.generate(user.getUsername());
    }

    @GetMapping("/test1")
    public String test1(HttpServletRequest request) {
        String jwt = request.getHeader("Authorization");
        if (null == JwtUtil.parse(jwt)) {
            return "请先登录！";
        }
        return "成功得到test1的数据！";
    }

}
