package com.springdemo.Service;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName TestInterceptor
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/1 16:49
 * @Version 1.0
 **/
public class TestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest,
        javax.servlet.http.HttpServletResponse httpServletResponse,Object o)throws Exception{
        System.out.println("preHandle()......");
        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest,
       javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
        throws Exception{
        System.out.println("postHandle()......");
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest,
       javax.servlet.http.HttpServletResponse httpServletResponse,Object o,Exception e)
        throws Exception{
        System.out.println("afterCompletion()......");
    }
}