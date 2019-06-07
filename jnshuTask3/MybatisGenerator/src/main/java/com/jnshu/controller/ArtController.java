package com.jnshu.controller;

import com.jnshu.model.Art;
import com.jnshu.model.Banner;
import com.jnshu.service.ArtService;
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
public class ArtController {
    private static final Logger logger= LogManager.getLogger(ArtController.class);
    @Autowired
    ArtService artService;

    //art是展品（画作）的具体信息表，这里实现的功能为对作品的增删查改和上下架
    //添加art
    @RequestMapping(value ="/art",method = RequestMethod.POST)
    public ModelAndView addArt(Art art, Integer statuss, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(art);
        logger.info("status"+statuss);
        art.setStatus(statuss);
        if (artService.insertSelective(art)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除art
    @RequestMapping(value = "/art/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteArt(@PathVariable("id") Long id, ModelAndView model){
        logger.info("==============start to delete art=========================");
        logger.info("delete id is :"+id);
        if(artService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改art
    @RequestMapping(value = "/art",method = RequestMethod.PUT)
    public ModelAndView updateArt(Art art,ModelAndView modelAndView){
        if(artService.updateByPrimaryKeySelective(art)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(art);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询单个art
    @RequestMapping(value = "/art/{id}",method = RequestMethod.GET)
    public ModelAndView getArt(@PathVariable Long id, ModelAndView modelAndView){
        Art art=artService.selectByPrimaryKey(id);
        logger.info(art);
        if (art!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("art",art);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json3");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/art/list",method = RequestMethod.GET)
    public ModelAndView getArtList(ModelAndView modelAndView){
        List<Art> artList=artService.selectByCondition();
        logger.info(artList);
        if (artList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("artList",artList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json4");
        return modelAndView;
    }
    //修改上下架状态
    @RequestMapping(value = "/art/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,Art art,Integer statuss){
        art.setStatus(statuss);
        artService.updateStatus(art);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
