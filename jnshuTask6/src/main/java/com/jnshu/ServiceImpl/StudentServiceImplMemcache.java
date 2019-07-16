package com.jnshu.ServiceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jnshu.Dao.StudentMapper;
import com.jnshu.Entity.Student;
import com.jnshu.Service.StudentService;
import com.whalin.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("StudentServiceImplMemcache")
public class StudentServiceImplMemcache implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    //show方法展示优秀学员
    @Override
    public List<Student> show() {
        //这里首先我们先在缓存中找有没有对应的数据（优秀学员）
        List<Student> studentList;
        if (memCachedClient.get("excellent")!=null){
        //如果找到，就取出来，但是我们储存在memcache中的是json字符串，于是要转换成list
            studentList= JSONObject.parseArray((String) memCachedClient.get("excellent"),Student.class);
        //这里list数据就转换成功了，可以将这个值返回
            return studentList;
        }
        //如果我们从缓存中没有找到，那么我们就从数据库中提取，并将数据缓存在memcache中
         studentList =studentMapper.show();
        //这里list需要转换成json缓存在memcache中
        String excellent= JSON.toJSON(studentList).toString();
        memCachedClient.add("excellent",excellent);
        return studentList;
    }

    //统计工作人数
    @Override
    public Integer countByWorking() {
        //先判断缓存中有没有工作人数，有就返回，没有就进行数据库的搜索
        if (memCachedClient.get("number")!=null){
            return (Integer) memCachedClient.get("number");
        }
        Integer number=studentMapper.countByWorking();
        //数据库搜索完毕，将结果加到缓存中
        memCachedClient.add("number",number);
        return number;
    }

    //统计在学人数
    @Override
    public Integer countByLearning() {
        //先在缓存中搜索看有没有在学的人数，没有就在数据库中进行搜索
        if (memCachedClient.get("count")!=null){
            return (Integer) memCachedClient.get("count");
        }
        //如果在缓存中找不到，就去数据库找，并添加到缓存中
        Integer count=studentMapper.countByLearning();
        memCachedClient.add("count",count);
        return count;
    }



    @Autowired
    MemCachedClient memCachedClient;

//
//    //插入
//    @Override
//    public int insertStudent(Student student) {
//        int id = studentMapper.insertStudent(student);
//        if (id>0){
//            //执行成功，写入缓存中,并以id为识别部分命名键值对的键
//            memCachedClient.add("student"+id,student);
//        }
//
//        return id;
//    }
//
//    //删除
//    @Override
//    public boolean deleteStudent(Long id) {
//        if (studentMapper.deleteStudent(id)){
//            //删除成功就同步到缓存中,删除缓存
//            memCachedClient.delete("student"+id);
//            return true;
//        }else {
//         return false;
//        }
//    }
//
//    //更新
//    @Override
//    public boolean updateStudent(Student student) {
//        if (studentMapper.updateStudent(student)){
//            //更新成功，同步到缓存，缓存也更新
//            memCachedClient.replace("student"+student.getId(),student);
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    //查询单个
//    @Override
//    public Student findStudentById(Long id) {
//        //先查询缓存中是否存在，存在就直接提取，不访问数据库
//        Student student= (Student) memCachedClient.get("student"+id);
//        if (student!=null){
//            System.out.println("从缓存中提取");
//        }else {
//            //当我们在缓存中找不到相应的key对应的学生，那么只能去数据库查
//             student=studentMapper.findStudentById(id);
//             //查到之后我们会把这个加到缓存中
//            memCachedClient.add("student"+id,student);
//        }
//        return student;
//    }
//
    @Override
    public List<Student> findAllStudent() {
           List<Student> studentList;
        //这里使用findAllStudent来返回student的数据（list）然后我们先在memcache中判断有没有数据，有就不从数据库中搜索
       if (memCachedClient.get("student")!=null){//这里注意从memcache中取出来的都是json字符串要转成lsit
           studentList=JSONObject.parseArray((String) memCachedClient.get("student"),Student.class);
           return studentList;
       }
       //如果缓存中没有那么我们就从数据库中查询，并把结果list存为json字符串放进缓存
        studentList=studentMapper.findAllStudent();//把查到的结果存在studentList中
        String student=JSON.toJSON(studentList).toString();//转换list成json字符串
        memCachedClient.add("student",student);//存进缓存
        return studentList;
    }
}
