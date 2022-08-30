package com.majortom.web.controller;

import com.majortom.web.common.Result;
import com.majortom.web.pojo.entity.Person;
import com.majortom.web.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private PersonService personService;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello!";
    }

    @GetMapping("/page")
    public Result<List<Person>> queryPage(@RequestParam(required = false) Integer currentPage,
                                          @RequestParam(required = false) Integer pageSize) {
        currentPage = null == currentPage ? 1 : currentPage;
        pageSize = null == pageSize ? 10 : pageSize;
        return Result.success(personService.queryPage(currentPage, pageSize), personService.count());
    }

    @GetMapping("/get/{id}")
    public Result<Person> getById(@PathVariable Long id) {
        return Result.success(personService.getById(id));
    }

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return personService.list();
    }

    @GetMapping("/testOrderBy/{grade}")
    public List<Person> testOrderBy(@PathVariable(value="grade")String grade) {
        return personService.testOrderBy(grade);
    }

}
