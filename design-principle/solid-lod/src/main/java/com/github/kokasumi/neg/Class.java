package com.github.kokasumi.neg;

import com.github.kokasumi.Student;

import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/5 13:41
 * @description 班级
 * @since v1.0
 */
public class Class {
    private Long id;
    private String name;
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
