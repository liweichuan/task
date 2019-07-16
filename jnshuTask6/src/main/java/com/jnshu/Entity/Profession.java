package com.jnshu.Entity;

import org.springframework.stereotype.Component;

@Component
public class Profession {
    private Long id;

    private String name;

    private String picture;

    private String introduction;

    private Long sill;

    private Long grade;

    private String growth;

    private Long scarcity;

    private String salary_one;

    private String salary_two;

    private String salary_three;

    private Long number;

    private Long create_time;

    private Long update_time;

    private String create_by;

    private String update_by;

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Long getSill() {
        return sill;
    }

    public void setSill(Long sill) {
        this.sill = sill;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public Long getScarcity() {
        return scarcity;
    }

    public void setScarcity(Long scarcity) {
        this.scarcity = scarcity;
    }

    public String getSalary_one() {
        return salary_one;
    }

    public void setSalary_one(String salary_one) {
        this.salary_one = salary_one;
    }

    public String getSalary_two() {
        return salary_two;
    }

    public void setSalary_two(String salary_two) {
        this.salary_two = salary_two;
    }

    public String getSalary_three() {
        return salary_three;
    }

    public void setSalary_three(String salary_three) {
        this.salary_three = salary_three;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", introduction='" + introduction + '\'' +
                ", sill=" + sill +
                ", grade=" + grade +
                ", growth='" + growth + '\'' +
                ", scarcity=" + scarcity +
                ", salary_one='" + salary_one + '\'' +
                ", salary_two='" + salary_two + '\'' +
                ", salary_three='" + salary_three + '\'' +
                ", number=" + number +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                '}';
    }
}
