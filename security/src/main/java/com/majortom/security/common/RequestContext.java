package com.majortom.security.common;

import com.majortom.security.entity.Person;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 上下文对象
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/22 21:40
 */
public class RequestContext {
    public static HttpServletRequest getCurrentRequest() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return servletRequestAttributes.getRequest();
    }

    public static Person getCurrentUser() {
        return (Person) getCurrentRequest().getSession().getAttribute("user");
    }
}
