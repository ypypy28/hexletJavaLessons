import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("HELLO");

        //one variable - 32 bit of RAM (4 bite)
        int age = 0;
        System.out.println(age); //System.out.println(2);
        age = 11;
        System.out.println(age);
        age = age + 1; // 11 + 1: age = 12;
        System.out.println(age);
        age *= 2;
        System.out.println(age);
        age = (age * 2) - 24 + 2; // (24 * 2) - 24 + 2 // 24 + 2 // 26
        System.out.println(age);
    }

}