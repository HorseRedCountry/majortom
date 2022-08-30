package com.majortom.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majortom.web.pojo.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 21:09
 */
public interface PersonMapper extends BaseMapper<Person> {
    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Select("select * from person limit ${begin},${pageSize}")
    List<Person> queryPage(@Param("begin") Integer currentPage, @Param("pageSize")Integer pageSize);

    @Select("SELECT * FROM (SELECT * FROM person WHERE grade=#{grade} order by gmt_create DESC LIMIT 1000) a GROUP BY name")
    List<Person> testOrderBy(@Param("grade") String grade);
}
