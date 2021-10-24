package mainapp;

import model.Company;
import model.Person;
import sun.misc.VM;

import java.sql.SQLOutput;

public class RunTest {



    public static void main(String[] args) {
//        System.out.println("instance variable");
//       Person person = new Person(); // create a instance | person is Object
//        System.out.println(person.age);
//        // access instance varibles: access modifier public
//        System.out.println(person.name);

        //Company company = new Company(person);


        //System.out.println(Person.x);

        //System.out.println("First argument = " + args[0]);

//        byte x = 1; // memory 8 bit . 1G = 1024Mb, 1 Mb = 1024 kb. Ex: -128 - 127
//        x = 127; // x in range -128 - 127 (count, value field in -128 - 127
//
//        // byte < short < int < long --> int
//        // float < double
//
//        int z = 8;
//        Integer b = 8; // CLass , the same as Person
//
//        String s = "Hello";
//        char c = 'a';
//
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        int x1 = 1;
//        Integer x2 = 2;
//        // Boxing vs Auto Boxing
//        // Unboxing vs Auto Unboxing ???
//
//        Person p = new Person(); // Construct of Object
//
//       // Class inherit Object -> Constructor
//        Object obj = new Person();
        // polymorphism java in OOP
        // ???

        // primive type vs Object
        // Object (variables, function)
        //String s2 = "Hello world\\nSunday";
        //System.out.println(s2);

//        String s3 = "Hello World 'Sunday'";
//        System.out.println(s3);
//
//        char c = '\'';
//        char c2 = 'A';
//        System.out.println(c);
//        System.out.println((int) c2); // ASCII convert decimal, hex, oct, bin ???
//
//        int b = (int) c2 + 1; // ascii B
//        System.out.println((char) b); // B

        //Array
        // init 1
//        int[] arr2 = {1,2,3,4}; // create length = 4
//        System.out.println(arr2.length);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//
//
//        int[] arr3 = new int[4];
////        arr3[0] = 1;
//        arr3[1] = 2;
//        arr3[2] = 3;
//        arr3[3] = 4;

        // TestNG DataProvider annotation
//        String[][] names = {
//                {"Mr. ", "Mrs. ", "Ms. "},
//                {"Smith", "Jones"}
//        };
        //System.out.println(names[0][1]);

//        int[] arr = new int[10];
//        System.out.println(arr.length);

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[7]; // index: 0, 1, 2, 3, 4, 5, 6
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        for (String coffee : copyTo) {
//            System.out.print(coffee + " ");
//        }

        //i++ ++i
//        int dstIndex = 0;
//        for(int i=2; i<8; i++) { // 2 3 4 5 6 7
//            copyTo[dstIndex] = copyFrom[i]; // copyTo[0] = ; copyTo[1] = ; ...copyTo[6] .. copyTo[7] =
//            dstIndex++;
//        }
//
//        //System.out.println(copyTo); // out address
//        for (String coffee : copyTo) {
//            System.out.print(coffee + " ");
//        }
//        System.out.println();
//
//        for (int i=0; i<copyTo.length; i++) {
//            System.out.print(copyTo[i] + " ");
//        }
//
//        System.out.println();
//        int[] arr4 = new int[4]; // default = 0
//        for (int i=0; i<arr4.length; i++) {
//            System.out.print(arr4[i] + " ");
//        }
//
//        System.out.println();
//        String[] arr5 = new String[4]; // default = null, not empty
//        // String is object (null, not null(address)
//        for (int i=0; i<arr5.length; i++) {
//            System.out.print(arr5[i] + " ");
//        }
//
        String s = "Hello";
        printStatement(s);
        System.out.println(s); // Hello or How are you? --> Hello


//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1.hashCode()); // Object after hashcode => unique
//        System.out.println(s2.hashCode());
//        System.out.println(s1 == s2); // true or false? compare 2 address ==> result = true
//        // Hello vs Hello
//        String s3 = s1 + s2 + "VN"; // '+' operator --> new StringBuilder() --> address1
//        String s4 = s1 + s2; // '+' operator --> new StringBuilder() --> address2
//        System.out.println("s3 = " + s3);
//        System.out.println("s4 = " + s4);
//        System.out.println("s3 hashcode = " + s3.hashCode());
//        System.out.println("s4 hashcode = " + s4.hashCode());
//        System.out.println(s3 == s4); //==> true or false? --> result = false (compare 2 object stringBuilder)
//        System.out.println(s3.equals(s4));// ==> true or false? --> result = true

        //StringBuilder vs StringBuffer == > different ? StringBuilder = not thread safe , StringBuffer is thread safe (later)
//        StringBuilder stringBuilder1 = new StringBuilder("Hello");
//        stringBuilder1.append("Hello");
//        System.out.println(stringBuilder1); // --> HelloHello ?

//        StringBuilder stringBuilder2 = new StringBuilder("Hello");
//        System.out.println(stringBuilder1.hashCode());
//        System.out.println(stringBuilder2.hashCode());
//        System.out.println(stringBuilder1 == stringBuilder2);
//        //System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString()));
//        String s1 = stringBuilder1.toString();
//        String s2 = stringBuilder2.toString();
//        System.out.println(s1.equals(s2));



        //StringBuffer stringBuffer = new StringBuffer();


        //System.out.println(s1.equals(s2)); // Correct way --> Interview: s1==s2(compare address) Or s1.equals(s2)(compare value) --> different

//        System.out.println("----------------------");
//
//        Person p1 = new Person("Tom", 12, 'M');
//        Person p2 = new Person("Tom", 12, 'M');
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println("p1 address = " + p1);
//        System.out.println("p2 address = " + p2);
//        System.out.println(p1 == p2); // true or false ? // compare 2 address
//        // p1 same p2 ?

        //To Sum up
        // Compare 2 value string ==> equals
        // + : recommend StringBuilder (good performance) ===> javap .class ??? (later)


    }

    // value or reference
    // String is immutable
    public static void printStatement(String statement) {
        statement = "How are you?";
    }



}

// Naming Rules:
// - Constant: URL, DB_CONNECT_STRING, .... (Uppercase)
// - Function name: camel case . Ex: connectDB, writeFile, ...
// - Packages: com.modules, model, dataobject,...
// - Class: Capitalize Ex: Person, Manager, ...
// - Variables: name, age, loop: personItem, item, ...
