import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {

        String name = "Kolya";
        int myAge = 22;
        double weight = 86.8;
        String outString = name + ": age " + myAge + ", weight " + weight;
        System.out.println(outString);
        System.out.println(outString);

        boolean old = myAge >= 99;
        boolean young = myAge < 99;
        System.out.println("old: " + old);
        System.out.println("young: " + young);

    }

}