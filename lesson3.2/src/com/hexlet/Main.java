package com.hexlet;

import com.hexlet.common.Course;
import com.hexlet.humans.*;
import com.hexlet.buildings.Building;

public class Main {

    public static void main(String[] args) {

        Student studentMax = new Student();
        studentMax.course = new Course();
        studentMax.course.name = "Java course";
        studentMax.name = "Max";
        studentMax.sayHello();

        Student studentSlava = new Student();
        studentSlava.course = new Course();
        studentSlava.sayHello();

    }

}

// ref. null
// int, long, short => 0
// 0.0
// false
// char ? - Найти!