package com.jnshu.Entity;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Student implements Serializable {
    private Long id;

    private String name;

    private String picture;

    private Boolean working;

    private String company;

    private String job;

    private Long profession_id;

    private String expreience;

    private Boolean excellent;

    private Long create_time;

    private Long update_time;

    private String create_by;

    private String update_by;

    private Profession profession;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(Long profession_id) {
        this.profession_id = profession_id;
    }

    public String getExpreience() {
        return expreience;
    }

    public void setExpreience(String expreience) {
        this.expreience = expreience;
    }

    public Boolean getExcellent() {
        return excellent;
    }

    public void setExcellent(Boolean excellent) {
        this.excellent = excellent;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", working=" + working +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
                ", profession_id=" + profession_id +
                ", expreience='" + expreience + '\'' +
                ", excellent=" + excellent +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                ", profession=" + profession +
                '}';
    }
}

