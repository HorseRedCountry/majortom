package com.majortom.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majortom.security.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/9 15:05
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
