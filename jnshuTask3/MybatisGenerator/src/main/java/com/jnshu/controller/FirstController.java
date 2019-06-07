package com.jnshu.controller;

import com.jnshu.model.First;
import com.jnshu.service.FirstService;
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
public class FirstController {
    private static final Logger logger= LogManager.getLogger(FirstController.class);
    @Autowired
    FirstService firstService;
    //一级菜单增删查改和上下架
    //添加一级菜单first
    @RequestMapping(value ="/first",method = RequestMethod.POST)
    public ModelAndView addFirst(First first, Integer statuss, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(first);
        logger.info("status"+statuss);
        first.setStatus(statuss);
        if (firstService.insertSelective(first)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除first
    @RequestMapping(value = "/first/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteFirst(@PathVariable("id") Long id, ModelAndView model){
        logger.info("==============start to delete first=========================");
        logger.info("delete id is :"+id);
        if(firstService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改first
    @RequestMapping(value = "/first",method = RequestMethod.PUT)
    public ModelAndView updateFirst(First first,ModelAndView modelAndView){
        if(firstService.updateByPrimaryKeySelective(first)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(first);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询单个
    @RequestMapping(value = "/first/{id}",method = RequestMethod.GET)
    public ModelAndView getFirst(@PathVariable Long id, ModelAndView modelAndView){
        First first=firstService.selectByPrimaryKey(id);
        logger.info(first);
        if (first!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("first",first);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json7");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/first/list",method = RequestMethod.GET)
    public ModelAndView getFirstList(ModelAndView modelAndView){
        List<First> firstList=firstService.selectByCondition();
        logger.info(firstList);
        if (firstList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("firstList",firstList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json8");
        return modelAndView;
    }
    //更改一级菜单上下架
    @RequestMapping(value = "/first/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,First first,Integer statuss){
        first.setStatus(statuss);
        firstService.updateStatus(first);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
