package com.majortom.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.majortom.web.pojo.entity.Person;
import com.majortom.web.mapper.PersonMapper;
import com.majortom.web.pojo.vo.PageVo;
import com.majortom.web.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
