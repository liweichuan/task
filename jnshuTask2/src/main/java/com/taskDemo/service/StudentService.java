package com.taskDemo.service;

import com.taskDemo.pojo.Student;

import java.util.List;

public interface StudentService {
    int insertStudent(Student student);

    Boolean deleteStudent(String name);

    Boolean updateStudent(Student student);

    Student findStudentByName(String name);

    List<Student> findAllStudent();
}
