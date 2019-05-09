//package com.springdemo.controller;
//
//import com.springdemo.POJO.Course;
//import com.springdemo.Service.CourseDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @ClassName CourseController
// * @Description TODO
// * @Author liweichuan
// * @Date 2019/5/1 10:50
// * @Version 1.0
// **/
//@Controller
//public class CourseController {
//    @Autowired
//    private CourseDao courseDao;
//    /**添加课程
//     * */
//    @PostMapping("/add")
//    public String add(Course course){
//        courseDao.add(course);
//        System.out.println(course);
//        return "redirect:/getAll";
//    }
//    /**查询所有课程
//     * */
//    @GetMapping("/getAll")
//    public String getAll(Model model){
//        model.addAttribute("courses",courseDao.getAll());
//        System.out.println("getAll......");
//        return "index";
//    }
//    /**根据id查询课程
//     * */
//    @GetMapping("/getById/{id}")
//    public String getById(@PathVariable("id") int id,Model model){
//        model.addAttribute("course",courseDao.getById(id));
//        return "edit";
//    }
//    /**修改课程
//     * */
//    @PutMapping("/update")
//    public String update(Course course){
//        courseDao.update(course);
//        return "redirect:/getAll";
//    }
//    /**删除课程
//     * */
//    @DeleteMapping("/delete/{id}")
//    public String delete(@PathVariable("id") int id){
//        courseDao.delete(id);
//        return "redirect/getAll";
//    }
//}