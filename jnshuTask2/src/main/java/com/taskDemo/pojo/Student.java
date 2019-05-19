package com.taskDemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/5/4 11:05
 * @Version 1.0
 **/
@Data
public class Student {
    private long id;
    private String name;
    private long qq;
    private String type;
    private String start_time;
    private String school;
    private long student_id;
    private String link;
    private String wish;
    private String bro;
    private String way;
    private Date create_time;
    private Date update_time;
    //setter&getter
}