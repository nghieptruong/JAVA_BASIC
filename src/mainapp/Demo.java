package mainapp;

public class Demo {

    public static void main(String[] args) {
//        ArrayDemo.printStatement("Xin chao"); // static
//
//       ArrayDemo arrayDemo = new ArrayDemo();
//       arrayDemo.printNotStaticMethod("Welcome");

        //System.out.println("Initial staticCount = " + ArrayDemo.staticCount);
        //ArrayDemo.staticCount = 1;
        //System.out.println("Set staticCount in main = " + ArrayDemo.staticCount);

        ArrayDemo demo1 = new ArrayDemo(); // instance 1 = x123
        //demo1.setCount(2); // --> staticCount = 2
        //System.out.println("Set in demo1 = " + ArrayDemo.staticCount);

        demo1.width = 10;
        demo1.height = 10;
        System.out.println("demo1 = [" + demo1.height + "," + demo1.width + "]"); // width, height = 10

        ArrayDemo x = new ArrayDemo(); // instance 2 = x456
        //System.out.println("x call staticCount = " + ArrayDemo.staticCount); // staticCount = 0 OR staticCoung = 2 ???
        //System.out.println("x = [" + x.height + "," + x.width + "]"); // width, height = 10 or 1 ??? --> 1
        x.width = 20;
        x.height = 20;
        System.out.println("x = [" + x.height + "," + x.width + "]"); // width, height = 20

        ArrayDemo y = new ArrayDemo();
        //System.out.println("y call staticCount = " + ArrayDemo.staticCount); // staticCount = 0 OR staticCoung = 2 ???
        System.out.println("y = [" + y.height + "," + y.width + "]"); // width, height = 10 or 1 ??? --> 1

        // In short: use static --> shared among objects
        // Example: static --> room --> BlackBoard (morning, evening, night)
        // morning: 10A1 --> Toan Cao Cap --> write f(x) --> no erase
        // evening: 11A1 --> f(x)

        // private using: instance variable
        // Example:
        // - morning 10A1: hop phan --> write, learn --> dep hop phan
        // - evening 11A1: hop phan --> write, learn --> dep hop phan
    }
}
