package com.jnshu.controller;

import com.jnshu.model.Banner;
import com.jnshu.model.Comment;
import com.jnshu.service.CommentService;
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
public class CommentController {
    private static final Logger logger= LogManager.getLogger(CommentController.class);
    @Autowired
    CommentService commentService;
    //留言实现的功能为增删查改，修改留言的等级，获取对留言的回复列表
    //添加comment
    @RequestMapping(value ="/comment",method = RequestMethod.POST)
    public ModelAndView addComment(Comment comment, Integer statuss, ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(comment);
        logger.info("status"+statuss);
        comment.setStatus(statuss);
        if (commentService.insertSelective(comment)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除comment
    @RequestMapping(value = "/comment/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteComment(@PathVariable("id") Long id,ModelAndView model){
        logger.info("==============start to delete comment=========================");
        logger.info("delete id is :"+id);
        if(commentService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改comment，为评论添加回复
    @RequestMapping(value = "/comment",method = RequestMethod.PUT)
    public ModelAndView updateComment(Comment comment,ModelAndView modelAndView){
        if(commentService.updateByPrimaryKeySelective(comment)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(comment);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询一个留言
    @RequestMapping(value = "/comment/{id}",method = RequestMethod.GET)
    public ModelAndView getComment(@PathVariable Long id, ModelAndView modelAndView){
        Comment comment=commentService.selectByPrimaryKey(id);
        logger.info(comment);
        if (comment!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("comment",comment);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json5");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/comment/list",method = RequestMethod.GET)
    public ModelAndView getCommentList(ModelAndView modelAndView){
        List<Comment> commentList=commentService.selectByCondition();
        logger.info(commentList);
        if (commentList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("commentList",commentList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json6");
        return modelAndView;
    }
    //更改留言的等级为精品还是普通
    @RequestMapping(value = "/comment/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,Comment comment,Integer statuss){
        comment.setStatus(statuss);
        commentService.updateStatus(comment);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
