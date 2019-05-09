package com.springdemo.Service;



/**
 * @ClassName UserService
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/29 10:33
 * @Version 1.0
 **/
import com.springdemo.POJO.User;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    public void login(User user){
        System.out.println(user);
    }
}