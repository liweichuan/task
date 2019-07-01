import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;


public class Token {
    @RequestMapping("/add.do")
    public String add(HttpServletRequest request, HttpServletResponse response){
        //生成Token
        UUID token=UUID.randomUUID();
        System.out.println("token为："+token);
        //放入session中
        request.getSession().setAttribute("token",token.toString());
        //放到request作用域中传到前台
        request.setAttribute("token",token);
        return "add";
    }
    //前台传过来的token进行对比
    @RequestMapping("/addMessage.do")
    public synchronized String addMessage(HttpServletRequest request){
        //获取session中的token
        Object token1=request.getSession().getAttribute("token");
        //获取前台传过来的token
        String token=request.getParameter("token");
        System.out.println("token1的值："+token1);
        if (token1==null){
            System.out.println("提交出错");
        }else if (!token1.equals(token)){
            System.out.println("提交出错");
        }else {
            System.out.println("提交成功");
            //移除session防止重复提交
            request.getSession().removeAttribute("token");
        }return "";
    }
}
