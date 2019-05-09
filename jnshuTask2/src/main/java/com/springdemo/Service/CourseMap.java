package com.springdemo.Service;

import com.springdemo.POJO.Course;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CourseMap
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/30 11:31
 * @Version 1.0
 **/
public class CourseMap {
    private Map<String, Course> courses = new HashMap<>();

    public Map<String,Course> getCourses(){
        return courses;
    }
    public void setCourses(Map<String,Course> courses){
        this.courses=courses;
    }
}