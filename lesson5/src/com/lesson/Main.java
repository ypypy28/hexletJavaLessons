package com.lesson;

public class Main {

    public static void main(String[] args) {
        ExampleStaticFieldClass exampleStaticFieldClass = new ExampleStaticFieldClass();
        ExampleStaticFieldClass exampleStaticFieldClass2 = new ExampleStaticFieldClass();

        exampleStaticFieldClass.nonStaticField = 4;
        ExampleStaticFieldClass.staticField = 4;  // - так правильно т.к. static - class level variable (а не instance level)

        exampleStaticFieldClass2.nonStaticField = 5;
        ExampleStaticFieldClass.staticField = 5;

        System.out.println(exampleStaticFieldClass.nonStaticField + ", " + exampleStaticFieldClass2.nonStaticField);
        System.out.println(ExampleStaticFieldClass.staticField + ", " + ExampleStaticFieldClass.staticField);

        System.out.println("Human.Min_AGE: " + Human.MIN_AGE);

        exampleStaticFieldClass.hello();
        ExampleStaticFieldClass.helloStatic();
    }
}

/*
    ExampleStaticFieldClass
        staticField    = 5

    exampleStaticFieldClass
        nonStaticField = 4

    exampleStaticFieldClass2
        nonStaticField = 5

*/