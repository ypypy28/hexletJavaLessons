package com.lesson;

public class Human {

    private        final String  name;

    private              int     age    = 0;

    public Human(String name) {
        super();
        this.name = name;
        System.out.println("In Human");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void birthday() {
        age++;
    }
}
