//package com.springdemo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.Map;
//
///**
// * @ClassName AnnotationHandler
// * @Description TODO
// * @Author liweichuan
// * @Date 2019/4/28 15:21
// * @Version 1.0
// **/
//@Controller
//public class AnnotationHandler {
//    /**业务方法
//     *@描述使用ModelAndView完成数据传递，视图解析
//     *@参数  []
//     *@返回值  org.springframework.web.servlet.ModelAndView
//     *@创建人  liweichuan
//     *@创建时间  2019/4/28 15:28
//     *@修改人和其它信息
//     */
//    @RequestMapping("/modelAndViewTest")
//    public ModelAndView modelAndViewTest(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("name","Jack");
//        modelAndView.setViewName("WEB-INF/jsp/show");
//        return modelAndView;
//    }
//    /**业务方法
//     *@描述使用model传值，String进行视图解析
//     *@参数  [model]
//     *@返回值  java.lang.String
//     *@创建人  liweichuan
//     *@创建时间  2019/4/28 15:36
//     *@修改人和其它信息
//     */
//    @RequestMapping("/modelTest")
//    public String modelTest(Model model){
//        model.addAttribute("name","Lucy");
//        return "WEB-INF/jsp/show";
//    }
//    /**业务方法
//     *@描述 使用map传值，String解析视图。
//     *@参数  [map]
//     *@返回值  java.lang.String
//     *@创建人  liweichuan
//     *@创建时间  2019/4/28 15:43
//     *@修改人和其它信息
//     */
//    @RequestMapping("/mapTest")
//    public String mapTest(Map<String,String> map){
//        map.put("name","LiLei");
//        return "WEB-INF/jsp/show";
//    }
//}