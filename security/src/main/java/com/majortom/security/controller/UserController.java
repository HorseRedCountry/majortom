package com.majortom.security.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.majortom.security.entity.Person;
import com.majortom.security.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * Session
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/8 15:19
 */
@RestController
@RequestMapping(value = "/security-demo")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping(value = "/login")
    public String login(@RequestBody Person user, HttpSession session) {
        Person person = userService.getOne(
                new LambdaQueryWrapper<Person>()
                        .eq(Person::getUsername, user.getUsername())
                        .eq(Person::getPassword, user.getPassword())
        );
        if (null != person) {
            session.setAttribute("user", person);
            return "Login Sucess!";
        }
        return "Login Failed:Username Or Password Wrong!";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "Logout Sucess!";
    }

    @GetMapping(value = "/test1")
    public String test1() {
        return "Test1 Data";
    }

    @GetMapping(value = "/test2")
    public String test2() {
        userService.doSomething();
        return "Test2 Data";
    }

    @GetMapping(value = "/test3")
    public Person test3() {
        return userService.getById(1L);
    }

}
