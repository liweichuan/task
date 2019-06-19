package com.jnshu.ServiceImpl;

import com.jnshu.Dao.StudentMapper;
import com.jnshu.Entity.Student;
import com.jnshu.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> show() {
        return studentMapper.show();
    }

    @Override
    public Integer countByWorking() {
        return studentMapper.countByWorking();
    }

    @Override
    public Integer countByLearning() {
        return studentMapper.countByLearning();
    }
}
