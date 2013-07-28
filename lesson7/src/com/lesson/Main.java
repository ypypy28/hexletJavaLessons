package com.lesson;

public class Main {

    public static void main( String[] args) {

        Human human1 = new Human("Max");
        System.out.println(human1.getName());
        System.out.println("------------");
        Student student1 = new Student("Slava");
        System.out.println(student1.getName());
        System.out.println("------------");

        //Создадим дом и поселим в него студента
        House house = new House();
        house.setHuman(student1);

        System.out.println("Owner name " + house.getOwnerName());
        System.out.println("------------");

        //делаем учителя Т1 и теперь в доме будет только он.
        Teacher teacher1 = new Teacher("T1");
        house.setHuman(teacher1);

        System.out.println("Owner name " + house.getOwnerName());
        System.out.println("------------");

        System.out.println(student1);
    }
}
