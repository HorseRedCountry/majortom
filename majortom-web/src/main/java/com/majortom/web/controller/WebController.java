package com.majortom.web.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.majortom.web.common.Result;
import com.majortom.web.pojo.entity.Person;
import com.majortom.web.service.PersonService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
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
    public List<Person> testOrderBy(@PathVariable(value = "grade") String grade) {
        return personService.testOrderBy(grade);
    }

    @PostMapping("/import")
    public void testImport(@RequestBody MultipartFile file) throws IOException {
        ExcelReader reader = ExcelUtil.getReader(file.getInputStream(), 0);
        List<List<Object>> objectList = reader.read();
        for (List<Object> objects : objectList) {
            //获取模板名称
            if ("模板名称".equals(objects.get(0).toString())) {
                System.out.println("模板名称为：" + objects.get(1).toString());
                continue;
            }
            //获取适用人员
            if ("模板适用人员".equals(objects.get(0).toString())) {
                System.out.println("模板适用人员为：" + objects.get(1).toString());
                System.out.println("开始处理模板适用人员.............");
                continue;
            }
            //跳过无用项
            if ("模板明细".equals(objects.get(0).toString()) || "序号".equals(objects.get(0).toString())) {
                continue;
            }
            //获取并处理模板明细
            System.out.println("**************************************");
            System.out.println("序号为：" + objects.get(0).toString());
            System.out.println("重点工作目标为：" + objects.get(1).toString());
            System.out.println("协同合作为：" + objects.get(2).toString());
            System.out.println("资源需求为：" + objects.get(3).toString());
            System.out.println("目标衡量标准为：" + objects.get(4).toString());
            System.out.println("**************************************");
        }

    }

}
