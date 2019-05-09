//package com.springdemo.controller;
//
//import com.springdemo.Service.CourseDao;
//import com.springdemo.POJO.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * @ClassName DataBindController
// * @Description TODO
// * @Author liweichuan
// * @Date 2019/4/29 14:52
// * @Version 1.0
// **/
//@Controller
//public class DataBindController {
//
//    @Autowired
//    private CourseDao courseDao;
//
//    /**绑定POJO对象
//     * */
//    @RequestMapping("pojoType")
//    public String pojoType(Course course, Model model){
//        //将课程添加到数据库
//        courseDao.add(course);
//        System.out.println(course);
//        //封装数据
//        model.addAttribute("courses",courseDao.getAll());
//        return "WEB-INF/jsp/showData";
//    }
//}