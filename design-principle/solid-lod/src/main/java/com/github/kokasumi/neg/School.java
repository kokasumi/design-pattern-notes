package com.github.kokasumi.neg;

import java.util.List;
import java.util.function.Consumer;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/5 13:43
 * @description 学校
 * @since v1.0
 */
public class School {
    private List<Class> classes;

    /**
     * 学校依赖Student类，破坏了迪米特原则
     */
    public void printStudents() {
        classes.forEach(aClass -> {
            // 打印班级名
            System.out.println(aClass.getName());
            // 打印学生名
            aClass.getStudents().forEach(student -> System.out.println(student.getName()));
        });
    }
}
