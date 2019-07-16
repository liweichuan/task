package com.jnshu.Dao;

import com.jnshu.Entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    //展示优秀学员
    List<Student> show();
    //计算找到工作的学员人数
    Integer countByWorking();
    //计算正在学习的学员人数；
    Integer countByLearning();
//    public int insertStudent(Student student);
//
//    public boolean deleteStudent(Long id);
//
//    public boolean updateStudent(Student student);
//
//    public Student findStudentById(Long id);
//
    List<Student> findAllStudent();
}
