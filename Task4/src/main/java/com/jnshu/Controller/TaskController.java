package com.jnshu.Controller;

import com.jnshu.Entity.Profession;
import com.jnshu.Entity.Student;
import com.jnshu.Service.ProfessionService;
import com.jnshu.Service.StudentService;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.SLF4JLogFactory;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Controller
public class TaskController {
    @Autowired
    StudentService studentService;
    @Autowired
    ProfessionService professionService;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String show(Model model){
        //展示优秀学员
        List<Student> studentList=studentService.show();
        //返回在学人数
        Integer count=studentService.countByLearning();
        //返回已经工作人数
        Integer number=studentService.countByWorking();
        model.addAttribute("studentList",studentList);
        model.addAttribute("count",count);
        model.addAttribute("number",number);

        return "home";
    }
    @RequestMapping(value = "/profession",method = RequestMethod.GET)
    public String find(Model model){
        List<Profession> professionList = professionService.getListProfession();
        System.out.println(professionList);
        model.addAttribute("professionList",professionList);
        return "profession";
    }
}
