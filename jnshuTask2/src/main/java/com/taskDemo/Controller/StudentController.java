package com.taskDemo.Controller; /**
 * @ClassName HelloWordController
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/1 18:04
 * @Version 1.0
 **/

import com.taskDemo.pojo.Student;
import com.taskDemo.service.StudentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

import javax.naming.Name;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
/** HelloWorldController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class StudentController {
    /**
     * org.springframework.web.bind.annotation.RequestMapping注解
     * 用来映射请求的的URL和请求的方法等。用来映射"/方法"
     * 方法名只是一个普通方法。
     * 该方法返回一个包含视图路径或视图路径和模型的ModelAndView对象。
     * */
    @Autowired

    StudentService studentService;
    private static final Log logger= LogFactory.getLog(StudentController.class);

    /**返回值跳转到学生添加界面
     * */
    @RequestMapping(value = "toAddStudent",method = RequestMethod.GET)
    public String toAddStudent(){
        return "addStudent";
    }
    /**添加学生
     * */
    @RequestMapping(value = "addStudent",method = RequestMethod.POST)
    public String addStudent(Model model,Student student){
        logger.info(student);
        if (student!=null) {
            studentService.insertStudent(student);
            model.addAttribute("student",student);
        }
        return "redirect:/findAllStudent";
    }
    /**更新学生数据
     * */
    @RequestMapping(value = "toUpdateStudent/{name}",method = RequestMethod.GET)
    public String toUpdateStudent(Model model,@PathVariable String name){
        model.addAttribute("student",studentService.findStudentByName(name));
        return "editStudent";
    }
    /**
     * 更新学生数据
     */
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public String updateStudent(Model model,Student student){
        if (studentService.updateStudent(student)){
            student=studentService.findStudentByName(student.getName());
            model.addAttribute("student",student);
            return "redirect:/findAllStudent";
        }else {
            return "error";
        }
    }

    /**删除学生
     * */
    @RequestMapping(value = "deleteStudent/{name}",method = RequestMethod.DELETE)
    public String deleteStudent( @PathVariable String name,Model model)throws Exception{
        model.addAttribute("student",studentService.deleteStudent(name));
        return "redirect:/findAllStudent";
    }

    /**查询单个学生
     * */
    @RequestMapping(value = "findStudent",method = RequestMethod.GET)
    public String findStudent(Model model,String name,@Validated Student student,BindingResult result){
        if (name==null || result.hasErrors()){
            List<ObjectError>allErrors=result.getAllErrors();
            for (ObjectError objectError:allErrors){
            System.out.println(objectError.getDefaultMessage());
            }
          model.addAttribute("errors",allErrors);
          return "error";
        }
        List<Student> students= Collections.singletonList(studentService.findStudentByName(name));
        model.addAttribute("student",students);
        return "findStudent";
    }
    /**查询学生所有数据
     * */
    @RequestMapping(value = "findAllStudent",method = RequestMethod.GET)
    public String findAllStudent(Model model){
        List<Student> students=studentService.findAllStudent();
        model.addAttribute("studentList",students);
        return "findAllStudent";
    }
/**
 （1）请求处理类必须在 IOC 容器中
 （2）@RequestMapping 用来映射请求，其中 value 属性指定映射的 url。可以作用类上，相当于 namespace 的作用。
 （3）返回值最终会被解析为 ModelAndView 对象。结合视图解析器，返回到视图。
 */

}
