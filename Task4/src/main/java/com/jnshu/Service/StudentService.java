package com.jnshu.Service;

import com.jnshu.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
        //展示优秀学员
        List<Student> show();
        //计算找到工作的学员人数
       Integer countByWorking();
        //计算正在学习的学员人数；
      Integer countByLearning();
}
