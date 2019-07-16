package com.jnshu.Service;

import com.jnshu.Entity.Student;

import java.util.List;

public interface StudentService {
        //展示优秀学员
        List show();
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
