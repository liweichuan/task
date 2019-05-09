package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName InterceptorController
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/1 16:43
 * @Version 1.0
 **/
@Controller
public class InterceptorController {
    @RequestMapping("/gotoTest")
    public String gotoTest(Model model){
        System.out.println("测试拦截器，控制器中gotoTest()方法执行。。。。");
        model.addAttribute("mess","拦截器测试！");
        return "test";
    }
}