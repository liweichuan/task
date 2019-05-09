package com.springdemo.controller;
import com.springdemo.POJO.Course;
import com.springdemo.Service.CourseDao;
import com.springdemo.Service.CourseSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/28 16:05
 * @Version 1.0
 **/

//@Controller
//public class TestController {
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }
//}


//@Controller
//@RequestMapping("/index")
//public class TestController{
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login")
//    public String login(String uname,String upwd){
//        //业务逻辑代码
//        return "main";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login")
//    public String login(HttpServletRequest request){
//        String uname = request.getParameter("uname");
//        String upwd = request.getParameter("upwd");
//        //业务逻辑代码
//        return "main";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login/{uname}/{upwd}")
//    public String login (@PathVariable String uname,@PathVariable String upwd){
//        //业务逻辑代码
//        return "main";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login")
//    public String login(@RequestParam String uname,@RequestParam String upwd){
//        //业务逻辑代码
//        return "index";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login")
//    public String login(@ModelAttribute("user") User user){
//        //业务逻辑代码
//        return "index";
//    }
//}

//@Controller
//@RequestMapping("/index")
//public class TestController{
//    @RequestMapping("/login")
//    public String login(){
//        //转发到一个请求方法（同一个控制器内可以省略/index/）
//        return "forward:/index/isLogin";
//    }
//
//    @RequestMapping("/isLogin")
//    public String isLogin(){
//        //重定向到一个请求方法
//        return "redirect:/index/isRegister";
//    }
//
//    @RequestMapping("/isRegister")
//    public String isRegister(){
//        //转发到一个视图
//        return "register";
////        //转发到一个静态资源
////        return "forword:/html/my.html";
//
//    }
//}

//@Controller
//public class TestController{
//
//    @Autowired  //利用注释导入服务类
//    private UserService userService;
//
//    @RequestMapping("/login")
//    public String login(User user){
//        userService.login(user);
//        return "test";
//    }
//}

//@Controller
//public class TestController{
//    @RequestMapping("/login")
//    public String login(@ModelAttribute("user") UserForm user){
//        //业务逻辑代码
//        return "index";
//    }
//}

//@Controller
//@RequestMapping("/admin")
//public class TestController extends BaseController{
//    @RequestMapping("/add")
//    public String add(){
//        return "test";
//    }
//}

/***
 * 绑定基本数据类型。
 */

//@Controller
//public class TestController {
//    @RequestMapping("/baseType")
//    @ResponseBody
//    public String baseType(@RequestParam("id") int id) {
//        return "id=" + id;
//    }
//}

/**
 * 绑定包装类
 * */
//@Controller
//public class TestController {
//    @RequestMapping("/packageType")
//    @ResponseBody
//    public String packageType(@RequestParam("id") Integer id){
//        return "id="+id;
//    }
//}

/**绑定数组类型
 * */
//@Controller
//public class TestController{
//    @RequestMapping("/arrayType")
//    @ResponseBody
//    public String arrayType(String[] name){
//        StringBuffer stringBuffer = new StringBuffer();
//        for (String item:name){
//            stringBuffer.append(item+" ");
//        }
//        return stringBuffer.toString();
//    }
//}

/**绑定List集合
 * */
//@Controller
//public class TestController{
//    @Autowired
//    private CourseDao courseDao;
//    @RequestMapping("listType")
//    public String listType(CourseList courseList, Model model){
//        for (Course course:courseList.getCourses()){
//            courseDao.add(course);
//        }
//        model.addAttribute("courses",courseDao.getAll());
//        return "showData";
//    }
//}

/**绑定Map集合
 * */
//@Controller
//public class TestController{
//    @Autowired
//    private CourseDao courseDao;
//    @RequestMapping("mapType")
//    public String mapType(CourseMap courseMap,Model model){
//        for (String key:courseMap.getCourses().keySet()){
//            Course course = courseMap.getCourses().get(key);
//            courseDao.add(course);
//        }
//        model.addAttribute("courses",courseDao.getAll());
//        return "showData";
//    }
//}

///**绑定Set集合    报错500有待解决
// * */
//@Controller
//public class TestController{
//    @Autowired
//    private CourseDao courseDao;
//    @RequestMapping("setType")
//    public String setType(CourseSet courseSet,Model model){
//        for (Course course:courseSet.getCourses()){
//            System.out.println(course);
//        }
//        model.addAttribute("courses",courseDao.getAll());
//        return "WEB-INF/jsp/showData";
//    }
//}

///**绑定json数据   有待解决
// * */
//@Controller
//public class TestController {
//    @RequestMapping("jsonType")
//    @ResponseBody
//    public Course jsonType(@RequestBody Course course){
//        course.setPrice(course.getPrice()+100);
//        return course;
//    }
//}