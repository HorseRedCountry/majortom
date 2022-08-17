package com.majortom.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.majortom.web.pojo.entity.Person;
import com.majortom.web.pojo.vo.PageVo;

import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 21:11
 */
public interface PersonService extends IService<Person> {
    /**
     * 分页查询
     *
     * @param currentPage 当前页
     * @param pageSize    每页数据量
     * @return /
     */
    List<Person> queryPage(Integer currentPage, Integer pageSize);
}
