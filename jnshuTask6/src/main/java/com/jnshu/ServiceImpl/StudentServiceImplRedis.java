package com.jnshu.ServiceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jnshu.Dao.StudentMapper;
import com.jnshu.Entity.Student;
import com.jnshu.Service.StudentService;
import com.jnshu.Tool.RedisUtil;
import com.whalin.MemCached.MemCachedClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("StudentServiceImplRedis")
public class StudentServiceImplRedis implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    RedisUtil redisUtil;


    private static final Logger logger= LogManager.getLogger(StudentServiceImplRedis.class);

    //show方法展示优秀学员
    @Override
    public List<Student> show() {
        //这里首先我们先在缓存中找有没有对应的数据（优秀学员）
        List<Student> studentList;
        if (redisUtil.getJsonString("excellent",Student.class)!=null){
            //如果找到，就取出来，但是我们储存在redis中的是json字符串，于是要转换成list
//            studentList= JSONObject.parseArray((String) redisUtil.getList("excellent"),Student.class);
             studentList= (List<Student>) redisUtil.getJsonString("excellent",Student.class);
            //这里list数据就转换成功了，可以将这个值返回
            return studentList;
        }
        //如果我们从缓存中没有找到，那么我们就从数据库中提取，并将数据缓存在redis中
        studentList =studentMapper.show();
        //这里list需要转换成json缓存在redis中
//        String excellent= JSON.toJSON(studentList).toString();
        redisUtil.setJsonString("excellent",studentList);
        return studentList;
    }

    //统计工作人数
    @Override
    public Integer countByWorking() {
        //先判断缓存中有没有工作人数，有就返回，没有就进行数据库的搜索
        if (redisUtil.get("number")!=null){
            return (Integer) redisUtil.get("number");
        }
        Integer number=studentMapper.countByWorking();
        //数据库搜索完毕，将结果加到缓存中
        redisUtil.set("number",number);
        return number;
    }

    //统计在学人数
    @Override
    public Integer countByLearning() {
        //先在缓存中搜索看有没有在学的人数，没有就在数据库中进行搜索
        if (redisUtil.get("count")!=null){
            return (Integer) redisUtil.get("count");
        }
        //如果在缓存中找不到，就去数据库找，并添加到缓存中
        Integer count=studentMapper.countByLearning();
        redisUtil.set("count",count);
        return count;
    }





    @Override
    public List<Student> findAllStudent() {
        List<Student> studentList;
        //这里使用findAllStudent来返回student的数据（list）然后我们先在redis中判断有没有数据，有就不从数据库中搜索
        if (redisUtil.getJsonString("excellent",Student.class)!=null){
//            studentList=JSONObject.parseArray((String) memCachedClient.get("student"),Student.class);
             studentList= (List<Student>) redisUtil.getJsonString("excellent",Student.class);
            return studentList;
        }
        //如果缓存中没有那么我们就从数据库中查询，并把结果list存为json字符串放进缓存
        studentList=studentMapper.findAllStudent();//把查到的结果存在studentList中
//        String student=JSON.toJSON(studentList).toString();
        redisUtil.setJsonString("student",studentList);//存进缓存
//        logger.info("----------------studentList:"+studentList);
//        System.out.println("----------------studentList:"+studentList);
        return studentList;
    }
}
