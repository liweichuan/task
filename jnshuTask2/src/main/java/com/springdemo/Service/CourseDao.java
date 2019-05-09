package com.springdemo.Service;

import com.springdemo.POJO.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CourseDao
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/29 14:43
 * @Version 1.0
 **/
@Repository
public class CourseDao {

    //模拟数据库存储数据
    private Map<Integer, Course> courseMap=new HashMap<>();

    /**添加课程
     * */
    public void add(Course course){
        courseMap.put(course.getId(),course);
    }
    /**查询所有课程
     * */
    public Collection<Course> getAll(){
        return courseMap.values();
    }
    /**通过ID查询课程
     */
    public Course getById(int id){
        return courseMap.get(id);
    }
    /**修改课程
     * */
    public void update(Course course){
        courseMap.put(course.getId(),course);
    }
    /**删除课程
     * */
    public void delete(int id){
        courseMap.remove(id);
    }
}