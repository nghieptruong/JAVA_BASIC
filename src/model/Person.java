package model;

public class Person {

    // instance variable
    //String name; //state (default access modifier) --> insite package: Y
    public String name; //state (public access modifier) --> insite, outsite package: Y
    // instance variable (default access modifier) --> insite package: Y
    //int age; // state
    public int age; // state (public access modifier) --> insite, outsite package: Y
    public char sex;

    public static String x = "Class varible"; // class variable = static variable (no need init)

    public Person() {
//        name = "Test";
//        //age = 25;
//        //System.out.println("name = " + name + " - age = " + age);
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void work() {
        // local variable: access in {}
        int workingHour = 9;
        System.out.println(workingHour);
    }

    public void study() {
        //workingHour = 4;
    }

    // signContract()
}
