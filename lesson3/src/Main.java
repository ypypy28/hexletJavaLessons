import java.io.IOException;

public class Main {

    public static void main (String[] args ) {

        // <type> <name>
        Student studentMax = new Student();              // -> 1
        studentMax.name = "Max";                         // -? 2
        studentMax.sayHello();
        studentMax.age = 25;                             // -> 3
        studentMax.sayHello();

        // sort of big mistake
        studentMax = new Student();                      // -> 4
        System.out.println("~~~~~~~~~~~~~~");
        studentMax.sayHello();

        // creating new student
        Student studentSlava = new Student();
        studentSlava.name = "Viacheslav";                 // -> 5
        studentSlava.sayHello();
        System.out.println("~~~~~~~~~~~~~~");

        // let's check if «bad» studentMax ("N/A") is still there
        studentMax.sayHello();

        // just a line for separating parts of System.out.println
        System.out.println("--||------||--");

        // trying to use another classes
        Cabinet cabinetJava = new Cabinet();
        cabinetJava.name = "Java Class";
        System.out.println( cabinetJava.name );

    }

}


// Memory
/*   
    1 ->  0x0111  Student{ name = "N/A". age = 15, sayHello() };
    2 ->  0x0111  Student{ name = "Max". age = 15, sayHello() };
    3 ->  0x0111  Student{ name = "Max". age = 25, sayHello() };
!!  4 ->  0x0111         { name = "Max", age = 25, satHello() };  - В памяти остался, но ссылка уже на другой адресс
    4 ->  0x1000  Student{ name = "N/A", age = 15, sayHello() };
    5 ->  0x1001  Student{ name = "Viacheslav", age = 15, sayHello() };
 */