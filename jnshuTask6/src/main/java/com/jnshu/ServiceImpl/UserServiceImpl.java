package com.jnshu.ServiceImpl;

import com.jnshu.Dao.UserMapper;
import com.jnshu.Entity.Result;
import com.jnshu.Entity.User;
import com.jnshu.Service.UserService;
import com.jnshu.Tool.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    Result result;

    String message;
    //注册
    @Override
    public long register(User user) {
        if (userMapper.findUserByName(user.getUserName())!=null||user.getUserName()==null||user.getUserName()==""){
            return 0;//用户名已存在，或用户名为空
        }
        //用户名不存在,进行注册之前判断密码为不为空
        else if (user.getPassWord()==null||user.getPassWord()==""){
            return 1;//注册密码为空
        }else {
            //在注册之前判定用户名不存在数据库，密码不为空，进行注册
            //对用户的密码进行md5加盐之后储存在数据库中
            String passWord = Md5Util.generate(user.getPassWord());//对密码进行加密加盐
            user.setPassWord(passWord);//将加密加盐的密码存储在user的属性中
            return userMapper.addUser(user);//将注册的用户信息存储在数据库
        }
    }

    //登录 ，对比用户输入的信息和数据库的信息
    @Override
    public Result checkLogin(String userName, String passWord) {
       User user = userMapper.findUserByName(userName);//先把user对象根据findUserByName找一下，看有没有
       //进行密码验证，根据查询出来的user对象，我们对比他的加密的密码，1、查询的对象为空，2、查询的对象存在，但是密码不对，3、查询的用户存在，密码也验证通过
       /*这里对返回信息进行一个改变，我们使用以一个result返回，状态码，信息，和user对象
        * */
        if (user==null){
            result.setCode("401");
            result.setMessage("用户名错误");
            result.setData(null);
            return result;
        }else if (!Md5Util.verify(passWord,user.getPassWord())){
            result.setCode("401");
            result.setMessage("密码错误");
            result.setData(null);
            return result;
        }else if (Md5Util.verify(passWord,user.getPassWord())){
            result.setCode("200");
            result.setMessage("正确");
            result.setData(user);
            return result;
        }
//        //进行密码验证
//        if(user!=null && Md5Util.verify(passWord,user.getPassWord())){
//            return user;   //别人解释，运行到return user就停止了，经过测试验证也是这样
//        }
        result.setCode("400");
        result.setMessage("未知错误");
        result.setData(null);
        return result;
//        //if为true，不就返回一个user，一个null,
    }


    @Override
    public User findById(long id) {
        return userMapper.findUserById(id);
    }
}
