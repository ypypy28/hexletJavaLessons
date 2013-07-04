package com.hexlet.humans;

import com.hexlet.common.Course;

public class Student {

    public String name = "N/A";

    public int age = 16;

    public Course course;

    public void sayHello() {

        System.out.println("Hello!!!111");
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        course.aboutCourse();

    }

}
