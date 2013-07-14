package com.lesson;

public class Human {

    public static final int MIN_AGE = 0;

    private static final int MAX_AGE = 130;

    private static final int MIN_NAME_LENGTH = 3;

    private String name;

    private int age;

    public void setAge(int newAge) {

        if (newAge > Human.MIN_AGE && newAge < Human.MAX_AGE) {
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
        if (newName !=null && newName.length() >= Human.MIN_NAME_LENGTH) {
            name = newName;
        }
    }

    public void sayHello() {
        System.out.println("Hi!");
    }

}


/*
  MIN_AGE
  MAX_AGE
  minNameLEngth
  name
  age
*/