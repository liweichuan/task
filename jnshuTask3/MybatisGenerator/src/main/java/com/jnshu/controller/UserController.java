package com.jnshu.controller;

import com.jnshu.model.Studio;
import com.jnshu.model.User;
import com.jnshu.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    private static final Logger logger= LogManager.getLogger(UserController.class);
    @Autowired
    UserService userService;
    //用户实现增删查改和修改密码
    //增加用户
    @RequestMapping(value ="/user",method = RequestMethod.POST)
    public ModelAndView addUser(User user, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(user);
        if (userService.insertSelective(user)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除user
    @RequestMapping(value = "/user/{name}",method = RequestMethod.DELETE)
    public ModelAndView deleteUserByName(@PathVariable("name") String name, ModelAndView model){
        logger.info("==============start to delete user=========================");
        logger.info("delete name is :"+name);
        if(userService.deleteByName(name)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改user
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public ModelAndView updateUser(User user,ModelAndView modelAndView){
        if(userService.updateByPrimaryKeySelective(user)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(user);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询单个
    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable String name, ModelAndView modelAndView){
        User user=userService.selectByName(name);
        logger.info(user);
        if (user!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("user",user);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json13");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public ModelAndView getUserList(ModelAndView modelAndView){
        List<User> userList=userService.selectByCondition();
        logger.info(userList);
        if (userList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("userList",userList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json14");
        return modelAndView;
    }
    //修改密码
    @RequestMapping(value = "/user/password",method = RequestMethod.PUT)
    public ModelAndView updatePassword(ModelAndView modelAndView,User user){
        userService.updatePassword(user);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
