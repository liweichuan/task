package com.taskDemo.Dao;

import com.taskDemo.pojo.Student;

import java.util.List;

public interface studentMapper {
    //添加学生数据
    int insertStudent(Student student);
    //根据名字删除学生数据
    Boolean deleteStudent(String name);
    //更新学生数据
    Boolean updateStudent(Student student);
    //根据name查询学生数据
    Student findStudentByName(String name);
    //查询所有学生数据
    List<Student> findAllStudent();
}
