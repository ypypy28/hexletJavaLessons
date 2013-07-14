package com.lesson;

public class Human {

    private final int minAge = 0;

    private final int maxAge = 130;

    private final int minNameLength = 3;

    private String name;

    private int age;

    public void setAge(int newAge) {

        if (newAge > minAge && newAge < maxAge) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName( String newName ) {
        if (newName !=null && newName.length() >= minNameLength) {
            name = newName;
        }
    }

    public void sayHello() {
        System.out.println("Hi!");
    }

}


/*
  minAge
  maxAge
  minNameLEngth
  name
  age
*/