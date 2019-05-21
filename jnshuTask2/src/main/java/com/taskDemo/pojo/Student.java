package com.taskDemo.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
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
    /**
     *@描述 @NotEmpty 用在集合类上面
     *      @NotBlank 用在String上
     *      @NotNull 用在基本类型上
     *@创建人  liweichuan
     *@创建时间  2019/5/20 15:04
     *@修改人和其它信息
     */
    @NotNull(message = "请填写id")
    private long id;
    @NotBlank(message = "学生姓名不能为空")
    private String name;
    private long qq;
    private String type;
    private String start_time;
    private String school;
    @NotNull(message = "请填写学号，且学号不能为零")
    private long student_id;
    private String link;
    private String wish;
    private String bro;
    private String way;
    private Date create_time;
    private Date update_time;
    //setter&getter
}