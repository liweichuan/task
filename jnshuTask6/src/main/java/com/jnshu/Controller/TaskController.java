package com.jnshu.Controller;

import com.jnshu.Entity.Profession;
import com.jnshu.Entity.Result;
import com.jnshu.Entity.Student;
import com.jnshu.Entity.User;
import com.jnshu.Service.ProfessionService;
import com.jnshu.Service.UserService;
import com.jnshu.ServiceImpl.StudentServiceImplRedis;
import com.jnshu.Tool.DesUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class TaskController {
    public final static Logger logger=LogManager.getLogger(TaskController.class);

    @Autowired
    @Qualifier(value = "StudentServiceImplRedis")
    StudentServiceImplRedis studentServiceImplRedis;
    @Autowired
    ProfessionService professionService;
    @Autowired
    UserService userService;
    @Autowired
    DesUtil desUtil;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String show(Model model){
        //展示优秀学员
        List<Student> studentList=studentServiceImplRedis.show();
        //返回在学人数
        Integer count=studentServiceImplRedis.countByLearning();
        //返回已经工作人数
        Integer number=studentServiceImplRedis.countByWorking();
        model.addAttribute("studentList",studentList);
        model.addAttribute("count",count);
        model.addAttribute("number",number);

        return "home";
    }

    @RequestMapping(value = "/u/profession",method = RequestMethod.GET)
    public String find(Model model){
        //需要做的就是每一次发出这个请求就验证“token”
        List<Profession> professionList = professionService.getListProfession();
        System.out.println(professionList);
        model.addAttribute("professionList",professionList);
        return "profession";
    }
    //访问时跳转登录页面
    @RequestMapping(value = "/login/0")
    public String login(){
        return "login";
    }

    //访问时跳转注册页面
    @RequestMapping(value = "/login/1")
    public String register(){
        return "register";
    }

    //登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String checkLogin(Model model,@Param("userName")String userName, @Param("passWord")String passWord,
                             HttpServletRequest request, HttpServletResponse response){
        Result result =userService.checkLogin(userName,passWord);
        User user= (User) result.getData();
        if (user!=null){
            logger.info(userName,passWord);
            logger.info("登录成功");
            //使用DES对用户ID和登录时间进行加密，生成token，放入cookie中
            long id=user.getId();
            String token=id+"/"+System.currentTimeMillis();//id和当前时间戳进行连接，中间加一个/
            try {
                token=desUtil.encrypt(token);//加密字符串
                Cookie cookie=new Cookie("token",token);//给cookie里面加一个键值对
                cookie.setMaxAge(60*3);//设置cookie的最大年龄，以秒为单位，这里就设置成180秒
                cookie.setPath("/");//官方的注释是：指定cookie的路径，客户端将cookie返回到该目录下
                //设置cookie的有效路径，比如把cookie的有效路径设置成“/xdp”,那么浏览器访问“xdp”目录下的web资源的时候也都会带上cookie
                logger.debug("cookie的有效路径是"+cookie.getPath()+"cookie的有效时间是"+cookie.getMaxAge()+
                        "cookie生成的名字为"+cookie.getName());//将生成的cookie发送给浏览器客户端
                response.addCookie(cookie);//将指定的cookie添加到响应中
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "loginSuccess";//验证通过
        }else {
            logger.debug("用户不存在，请重新登录");//这里就是登录验证不通过，
            model.addAttribute("result1",result);
            return "message";  //验证不通过，又跳转到登录页面
        }
    }
    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user, Model model){
        Result result=new Result();
        if (userService.register(user)==0) {
           //返回0说明是用户名存在，或者用户名为空
          result.setCode("401");
          result.setMessage("用户名已存在,或用户名为空");
          result.setData(null);
            model.addAttribute("result1",result);
            return "message";                  //为空
        }if (userService.register(user)==1){
            //返回值为1说明密码为空
            result.setCode("402");
            result.setMessage("注册失败，密码不能为空");
            result.setData(null);
            model.addAttribute("result1",result);
            return "message";
        }
        else {
            logger.info("注册成功，返回登录界面");
            return "registerSuccess";
        }
    }
    //注销,退出
    @RequestMapping(value = "/loginOut",method = RequestMethod.GET)
    public String loginOut(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies=request.getCookies();
        for (Cookie cookie:cookies){                //这里就是把cookie中的所有数据都来出来比对
            if ("token".equals(cookie.getName())){  //当我们找到了要注销的账号的信息，就把这个账号的信息进行修改
                cookie=new Cookie("token",null);//token的值设为null
                cookie.setMaxAge(0);               //这个cookie的是、有效时间设为0，（就是设为无效）
                cookie.setPath("/");
                response.addCookie(cookie);         //然后把这个cookie加到所有的cookie中存储
                return "redirect:/login/0";//重定向到登录页面
            }
        }
        return "redirect:/login/0";//重定向到登录页面
    }
    //关于页面，用json来传学生信息
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String findAllStudent(Model model){
        List<Student> studentList=studentServiceImplRedis.findAllStudent();
        model.addAttribute("studentList",studentList);
        return "student";
    }

}
