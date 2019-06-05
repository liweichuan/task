package com.jnshu.controller;

        import com.jnshu.model.Banner;
        import com.jnshu.model.Time;
        import com.jnshu.service.BannerService;
        import org.apache.log4j.LogManager;
        import org.apache.log4j.Logger;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.servlet.ModelAndView;

        import java.util.List;


@Controller
public class BannerController {
    private static final Logger logger= LogManager.getLogger(BannerController.class);
    @Autowired
    BannerService bannerService;
    //添加banner
    @RequestMapping(value ="/banner",method = RequestMethod.POST)
    public ModelAndView addBanner(Banner banner,Integer statuss,ModelAndView modelAndView){
        logger.info("=========================新增开始==============================");
        logger.info(banner);
        logger.info("status"+statuss);
        banner.setStatus(statuss);
        if (bannerService.insertSelective(banner)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","添加成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    //删除banner
    @RequestMapping(value = "/banner/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteBanner(@PathVariable("id") Long id,ModelAndView model){
        logger.info("==============start to delete banner=========================");
        logger.info("delete id is :"+id);
        if(bannerService.deleteByPrimaryKey(id)) {
            model.addObject("code", 200);
            model.addObject("msg", "删除成功");
        }else {
            model.addObject("code", 404);
            model.addObject("msg", "操作失败");
        }
        model.setViewName("json");
        return model;
    }
    //更改banner
    @RequestMapping(value = "/banner",method = RequestMethod.PUT)
    public ModelAndView updateBanner(Banner banner,ModelAndView modelAndView){
        if(bannerService.updateByPrimaryKeySelective(banner)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","更新成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        logger.info(banner);
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //查询一个
    @RequestMapping(value = "/banner/{id}",method = RequestMethod.GET)
    public ModelAndView getBanner(@PathVariable Long id, ModelAndView modelAndView){
        Banner banner=bannerService.selectByPrimaryKey(id);
        logger.info(banner);
        if (banner!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("banner",banner);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json1");
        return modelAndView;
    }
    //查询列表
    @RequestMapping(value = "/banner/list",method = RequestMethod.GET)
    public ModelAndView getBannerList(ModelAndView modelAndView){
        List<Banner> bannerList=bannerService.selectByCondition();
        logger.info(bannerList);
        if (bannerList!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("bannerList",bannerList);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","操作失败");
        }
        modelAndView.setViewName("json2");
        return modelAndView;
    }
    @RequestMapping(value = "/banner/status",method = RequestMethod.PUT)
    public ModelAndView updateStatus(ModelAndView modelAndView,Banner banner,Integer statuss){
        banner.setStatus(statuss);
        bannerService.updateStatus(banner);
        modelAndView.addObject("code",200);
        modelAndView.addObject("msg","修改成功");
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
