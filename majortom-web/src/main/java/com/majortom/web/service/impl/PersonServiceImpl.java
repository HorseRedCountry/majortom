package com.majortom.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.majortom.web.pojo.entity.Person;
import com.majortom.web.mapper.PersonMapper;
import com.majortom.web.pojo.vo.PageVo;
import com.majortom.web.service.PersonService;
import org.apache.ibatis.transaction.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 21:15
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
    @Override
    public List<Person> queryPage(Integer currentPage, Integer pageSize) {
        return baseMapper.queryPage((currentPage - 1) * pageSize, pageSize);
    }

    @Override
    public List<Person> testOrderBy(String grade) {
        // return baseMapper.testOrderBy(grade);
        LambdaQueryWrapper<Person> queryWrapper = new LambdaQueryWrapper<Person>()
                .eq(Person::getGrade, "1401")
                .orderByDesc(Person::getGmtCreate);
        List<Person> rawList = this.list(queryWrapper);
        List<Person> resultList = rawList.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(
                                () -> new TreeSet<>(Comparator.comparing(Person::getName))
                        ), ArrayList::new));
        return resultList;
    }
}
