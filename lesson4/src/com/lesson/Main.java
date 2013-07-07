package com.lesson;

public class Main {

       public static void main( String[] args ){
           Human human = new Human();
           human.setName("Max");
           System.out.println(human.getName());

           human.setAge(22);
           System.out.println(human.getAge());

           human.setAge(-3);
           System.out.println(human.getAge());
           System.out.println("~~~~~~~~~~~");
           human.setAge(128);
           System.out.println(human.getAge());


           human.setName("Kolya");
           System.out.println(human.getName());
           human.setName(null);
           System.out.println(human.getName());
           human.setName("bu");
           System.out.println(human.getName());

       }

}
