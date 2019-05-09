//package com.springdemo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//
//import javax.servlet.http.HttpSession;
//
///**
// * @ClassName BaseController
// * @Description TODO
// * @Author liweichuan
// * @Date 2019/4/29 11:08
// * @Version 1.0
// **/
//@Controller
//public class BaseController {
//    @ModelAttribute
//    public void isLogin(HttpSession session)throws Exception{
//        if (session.getAttribute("user") == null){
//            throw new Exception("没有权限");
//        }
//    }
//}