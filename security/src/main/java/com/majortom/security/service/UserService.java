package com.majortom.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.majortom.security.entity.Person;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  用户服务
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/22 21:47
 */

public interface UserService extends IService<Person> {
    void doSomething();
}
