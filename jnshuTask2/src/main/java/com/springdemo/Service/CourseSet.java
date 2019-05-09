package com.springdemo.Service;

import com.springdemo.POJO.Course;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName CourseSet
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/30 15:02
 * @Version 1.0
 **/
public class CourseSet {
    private Set<Course> courses = new HashSet<Course>();

    public CourseSet(){
        courses.add(new Course());
        courses.add(new Course());
    }

    public Set<Course> getCourses(){
        return courses;
    }
    public void setCourses(Set<Course> courses){
        this.courses=courses;
    }

}