package mainapp;

import java.util.Arrays;

public class DemoParameterFunction {

    public static void main(String[] args) {
        Student student1 = new Student();

        // Parameter in function
        // 1. value : primitive type (8)
        // 2. reference : objects
//        String[] hobbies1 = {"swim","listen music"};
//        System.out.println("Before = " + Arrays.asList(hobbies1)); // ["swim","listen music"]
//        student1.printHobby(hobbies1);
//        System.out.println("After = " + Arrays.asList(hobbies1)); // ["swim","listen music"] or ["football","listen music"]??? --> ["football","listen music"]
        // Purpose: ["swim","listen music"]

        // Shallow Copy or Deep Copy
        String[] inputData = {"B01", "B02"};
        System.out.println("Input data = " + Arrays.asList(inputData)); // ["B01", "B02"]
        student1.processData(inputData);
        System.out.println("After = " + Arrays.asList(inputData)); // ["B01", "B02"] or ["A01", "B02"] ??? --> ["B01", "B02"]



    }
}
