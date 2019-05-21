package com.taskDemo.Controller;

import com.taskDemo.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class JsonTest {
    @RequestMapping(value="test")
//    @ResponseBody
    //可以直接在返回的方法上添加@ResponseBody 实现对象自动转换json格式
//    public Map <String, Student> getStudentList() {
//        Student student1 = new Student();
//        student1.setName("小王");
//        student1.setQq(123456);
//        student1.setType("java后端工程师");
//        student1.setStart_time("2019年5月19日");
//        student1.setSchool("上海交通大学");
//        student1.setStudent_id(12345);
//        student1.setLink("www.126.com");
//        student1.setWish("希望可以找到一个好工作");
//        student1.setBro("孙悟空");
//        student1.setWay("知乎");
//        student1.setCreate_time(new Date());
//        student1.setUpdate_time(new Date());
//        Student student2 = new Student();
//        student2.setName("小张");
//        student2.setQq(123789);
//        student2.setType("java后端工程师");
//        student2.setStart_time("2019年5月19日");
//        student2.setSchool("上海大学");
//        student2.setStudent_id(12345);
//        student2.setLink("www.126.com");
//        student2.setWish("希望可以找到一个好工作");
//        student2.setBro("孙悟空");
//        student2.setWay("知乎");
//        student2.setCreate_time(new Date());
//        student2.setUpdate_time(new Date());
//        Map<String,Student> studentMap = new HashMap();
//        studentMap.put("001",student1);
//        studentMap.put("002",student2);
//        return studentMap;
//    }
    public String getStudentList(Model model){
        List<Student> students=new ArrayList<>();
        Student student1=new Student();
        student1.setName("小王");
        student1.setQq(123456);
        student1.setType("java后端工程师");
        student1.setStart_time("2019年5月19日");
        student1.setSchool("上海交通大学");
        student1.setStudent_id(12345);
        student1.setLink("www.126.com");
        student1.setWish("希望可以找到一个好工作");
        student1.setBro("孙悟空");
        student1.setWay("知乎");
        student1.setCreate_time(new Date());
        student1.setUpdate_time(new Date());
        Student student2 = new Student();
        student2.setName("小张");
        student2.setQq(123789);
        student2.setType("java后端工程师");
        student2.setStart_time("2019年5月19日");
        student2.setSchool("上海大学");
        student2.setStudent_id(12345);
        student2.setLink("www.126.com");
        student2.setWish("希望可以找到一个好工作");
        student2.setBro("孙悟空");
        student2.setWay("知乎");
        student2.setCreate_time(new Date());
        student2.setUpdate_time(new Date());
        students.add(student1);
        students.add(student2);
        model.addAttribute("stu",students);
        return "json";
    }
}