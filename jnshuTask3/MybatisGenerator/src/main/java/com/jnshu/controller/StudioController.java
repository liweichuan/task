package com.jnshu.controller;

import com.jnshu.model.Second;
import com.jnshu.model.Studio;
import com.jnshu.service.StudioService;
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
public class StudioController {
    private static final Logger logger= LogManager.getLogger(StudioController.class);
    @Autowired
    StudioService studioService;
    //工作室实现增删查改，上下架
    //添加工作室
    @RequestMapping(value ="/studio",method = RequestMethod.POST)
    public ModelAndView addStudio(Studio studio, Integer statuss, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(studio);
        logger.info("status"+statuss);
        studio.setStatus(statuss);
        if (studioService.insertSelective(studio)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除studio
    @RequestMapping(value = "/studio/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteStudio(@PathVariable("id") Long id, ModelAndView model){
        logger.info("==============start to delete Studio=========================");
        logger.info("delete id is :"+id);
        if(studioService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改studio
    @RequestMapping(value = "/studio",method = RequestMethod.PUT)
    public ModelAndView updateStudio(Studio studio,ModelAndView modelAndView){
        if(studioService.updateByPrimaryKeySelective(studio)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(studio);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询单个
    @RequestMapping(value = "/studio/{id}",method = RequestMethod.GET)
    public ModelAndView getStudio(@PathVariable Long id, ModelAndView modelAndView){
        Studio studio=studioService.selectByPrimaryKey(id);
        logger.info(studio);
        if (studio!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("studio",studio);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json11");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/studio/list",method = RequestMethod.GET)
    public ModelAndView getStudioList(ModelAndView modelAndView){
        List<Studio> studioList=studioService.selectByCondition();
        logger.info(studioList);
        if (studioList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("studioList",studioList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json12");
        return modelAndView;
    }
    //更改二级菜单上下架
    @RequestMapping(value = "/studio/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,Studio studio,Integer statuss){
        studio.setStatus(statuss);
        studioService.updateStatus(studio);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
