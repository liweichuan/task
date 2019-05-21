package com.taskDemo.service;

import com.taskDemo.Dao.studentMapper;
import com.taskDemo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/4 14:50
 * @Version 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private com.taskDemo.Dao.studentMapper studentMapper;
//实现插入方法
    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
//实现删除方法
    @Override
    public Boolean deleteStudent(String name) {
        return studentMapper.deleteStudent(name);
    }
//实现更新方法
    @Override
    public Boolean updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
//实现查询方法
    @Override
    public Student findStudentByName(String name) {
        return studentMapper.findStudentByName(name);
    }
//实现查询所有
    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }
}