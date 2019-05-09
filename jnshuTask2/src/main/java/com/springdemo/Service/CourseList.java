package com.springdemo.Service;

import com.springdemo.POJO.Course;

import java.util.List;

/**用于存储集合对象
 * @ClassName CourseList
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/30 10:03
 * @Version 1.0
 **/
public class CourseList {
    //定义一个全局变量
    private List<Course> courses;
    //定义get方法将Course数组中的数据都取出来
    public List<Course> getCourses(){
        return courses;
    }
    //定义set方法将Course数组中数据更新
    public void setCourses(List<Course> courses){
        this.courses=courses;
    }
}