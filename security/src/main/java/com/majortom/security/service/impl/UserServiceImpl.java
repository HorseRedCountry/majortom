package com.majortom.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.majortom.security.common.RequestContext;
import com.majortom.security.entity.Person;
import com.majortom.security.mapper.PersonMapper;
import com.majortom.security.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/22 21:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<PersonMapper, Person> implements UserService {
    @Override
    public void doSomething() {
        Person user = RequestContext.getCurrentUser();
        System.out.println("当前登录用户为：" + user);
    }
}
