package com.majortom.security.common;

import com.majortom.security.entity.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 * 登录过滤器
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/22 21:27
 */
@Component
public class Loginfilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println(request.getRequestURI());
        //登录请求直接放行
        if ("/security-demo/login".equals(request.getRequestURI())) {
            filterChain.doFilter(request, response);
            return;
        }
        //若已经登录，则放行
        Person user = (Person) request.getSession().getAttribute("user");
        if (null != user) {
            filterChain.doFilter(request, response);
            return;
        }
        //拦截请求后设置输出
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write("Please Login~");
        writer.flush();
        writer.close();
    }
}
