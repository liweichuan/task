//package com.springdemo.controller;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
///**
// * @ClassName com.springdemo.controller.MyHandler
// * @Description TODO
// * @Author liweichuan
// * @Date 2019/4/27 11:38
// * @Version 1.0
// **/
//public class MyHandler implements Controller {
//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        //装载模型数据和逻辑视图
//        ModelAndView modelAndView =new ModelAndView();
//        //添加模型数据
//        modelAndView.addObject("name","Tom");
//        //添加逻辑
//        modelAndView.setViewName("WEB-INF/jsp/show");
//        return modelAndView;
//    }
//}