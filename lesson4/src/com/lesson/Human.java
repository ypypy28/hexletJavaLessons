package com.lesson;

/*
    public
    protected
    – default "package locale"
    private
 */

public class Human {

    private final int minAge = 1; // final => const

    private final int maxAge = 120;

    private final int minNameLength = 3;

    private String name = "N/A";

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge) {
        if ( newAge >= minAge && newAge < maxAge) {
            age = newAge;
        } else {
            System.out.println("age setting ERROR!!11!");
        }
    }

    public String getName() {
        return name;

    }

    public void sayHello() {
        System.out.println("Hi!");
    }

    public void setName(String newName) {
        if ( newName != null && newName.length() >= minNameLength ) {
            name = newName;
        }
    }



}
