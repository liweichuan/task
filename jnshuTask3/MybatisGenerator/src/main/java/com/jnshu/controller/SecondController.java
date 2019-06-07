package com.jnshu.controller;

import com.jnshu.model.First;
import com.jnshu.model.Second;
import com.jnshu.service.SecondService;
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
public class SecondController {
    private static final Logger logger= LogManager.getLogger(SecondController.class);
    @Autowired
    SecondService secondService;
    //二级菜单和一级菜单的功能相同
    //添加一级菜单first
    @RequestMapping(value ="/second",method = RequestMethod.POST)
    public ModelAndView addSecond(Second second, Integer statuss, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(second);
        logger.info("status"+statuss);
        second.setStatus(statuss);
        if (secondService.insertSelective(second)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除second
    @RequestMapping(value = "/second/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteSecond(@PathVariable("id") Long id, ModelAndView model){
        logger.info("==============start to delete Second=========================");
        logger.info("delete id is :"+id);
        if(secondService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改second
    @RequestMapping(value = "/second",method = RequestMethod.PUT)
    public ModelAndView updateSecond(Second second,ModelAndView modelAndView){
        if(secondService.updateByPrimaryKeySelective(second)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(second);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询单个
    @RequestMapping(value = "/second/{id}",method = RequestMethod.GET)
    public ModelAndView getSecond(@PathVariable Long id, ModelAndView modelAndView){
        Second second=secondService.selectByPrimaryKey(id);
        logger.info(second);
        if (second!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("second",second);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json9");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/second/list",method = RequestMethod.GET)
    public ModelAndView getSecondList(ModelAndView modelAndView){
        List<Second> secondList=secondService.selectByCondition();
        logger.info(secondList);
        if (secondList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("secondList",secondList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json10");
        return modelAndView;
    }
    //更改二级菜单上下架
    @RequestMapping(value = "/second/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,Second second,Integer statuss){
        second.setStatus(statuss);
        secondService.updateStatus(second);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
