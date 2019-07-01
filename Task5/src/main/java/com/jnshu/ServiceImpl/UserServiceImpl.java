package com.jnshu.ServiceImpl;

import com.jnshu.Dao.UserMapper;
import com.jnshu.Entity.User;
import com.jnshu.Service.UserService;
import com.jnshu.Tool.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //注册
    @Override
    public long register(User user) {
        if (userMapper.findUserByName(user.getUserName())!=null){
            return 0;
        }
        //对用户的密码进行md5加盐之后储存在数据库中
        String passWord= Md5Util.generate(user.getPassWord());//对密码进行加密加盐
       user.setPassWord(passWord);//将加密加盐的密码存储在user的属性中
       return userMapper.addUser(user);//将注册的用户信息存储在数据库
    }

    //登录 ，对比用户输入的信息和数据库的信息
    @Override
    public User checkLogin(String userName,String passWord) {
       User user = userMapper.findUserByName(userName);//先把user对象根据findUserByName找一下，看有没有
       //进行密码验证，根据查询出来的user对象，我们对比他的加密的密码，1、查询的对象为空，2、查询的对象存在，但是密码不对，3、查询的用户存在，密码也验证通过
//        if (user==null){
//            System.out.println("你输入的用户不存在。");
//            return null;
//        }else if (!Md5Util.verify(passWord,user.getPassWord())){
//            System.out.println("密码错误。");
//            return null;
//        }else if (Md5Util.verify(passWord,user.getPassWord())){
//            System.out.println("登录成功。");
//            return user;
//        }
        //进行密码验证
        if(user!=null && Md5Util.verify(passWord,user.getPassWord())){
            return user;   //别人解释，运行到return user就停止了，经过测试验证也是这样
        }
        return  null;
        //if为true，不就返回一个user，一个null,
    }


    @Override
    public User findById(long id) {
        return userMapper.findUserById(id);
    }
}
