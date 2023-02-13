package com.github.kokasumi.pos;

import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/5 13:47
 * @description 学校
 * @since v1.0
 */
public class School {
    private List<Class> classes;

    public void printStudents() {
        classes.forEach(aClass -> {
            // 打印班级名
            System.out.println(aClass.getName());
            // 打印学生名
            aClass.printStudents();
        });
    }
}
