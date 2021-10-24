package mainapp;

import java.util.Arrays;
import java.util.function.Consumer;

public class ArrayDemo {

    // default instance variable: int, short, byte = 0...
    // String = null
    public int width = 1;
    public int height = 1;

    public static int staticCount = 0;

    // static: Class.<static method> OR Class.<static variable>
    // share among objects
    // not init = NEW
    public static void printStatement(String statement) {
        //statement = "How are you?";
        System.out.println(statement);
    }

    public static void setCount(int number) {
        staticCount = number;
    }

    public void printNotStaticMethod(String statement) {
        System.out.println(statement);
    }

    public static void main(String[] args) {

        int[] intArr = {1,2,3};
        // methods in automation
        //System.out.println(intArr.length);

        // Java 8: new feature (later)
        // short , easy
        // 1. predefined function
        // 2. stream
        // 3. lambda

        // case 1: for - traditional loop
//        for(int i = 0; i < intArr.length; i++)
//            System.out.println(intArr[i]);

        // case 2: for each
//        Integer[] integerArr = {1,2,3}; // Class wrapper: autoboxing vs boxing (later)
////        for(Integer i : integerArr) // for each [Object : Array]
////        {
////            int j = i * i;
////            System.out.println(j);
////        }
//
//        System.out.println("-------------------------------");
//        //case 3
//        //Java 8
////        Arrays.stream(integerArr).forEach(i -> System.out.println(i * i));
//
//        //case 4
//        System.out.println(integerArr); // reference address (x1234)
//        System.out.println(Arrays.asList(integerArr)); // print list


        // primitive type:
        //int: byte, short, int, long
        //double: float, double
        //char: char
        //boolean: boolean
        // reference type: Object, class object, array, collections

        //case 1: call static method;
        //String s = "Hello";
        //ArrayDemo.printStatement(s);
        // case 2: method name (in class file)
        //printStatement(s);

        // Use printNotStatic function
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.printNotStaticMethod("Hi");

    }
}
