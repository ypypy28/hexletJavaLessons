public class Student {

    // public <type> <name> ( = <initial value> ); //KISS (keep it simple, stupid)
    public String name = "N/A";

    public int age = 15;


    // public <type> <name>() {...}
    public void sayHello() {

        // My variation of Saying Hello
        System.out.println( "Hello, \n" +
                "my name is " + name + "\n" +
                "my age is " + age );

        // lesson variation of saying hello
        System.out.println( "Hello!!!11!" );
        System.out.println( "My name is - " + name );
        System.out.println( "My age is - " + age );

    }

}
