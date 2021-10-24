package mainapp;

import java.util.Arrays;

public class Student {

    public void printHobby(String[] hobbies) {
        // Handle
        hobbies[0] = "football";
        System.out.println("In Student = " + Arrays.asList(hobbies)); // ["swim","listen music"] or ["football","listen music"] ??? -> ["football","listen music"]
    }

    public void processData(String[] data) { // ["B01", "B02"]
        //...Handle
        // Copy -> backup --> execute backup
        // copy data -> shallow copy
//        String[] backup = data; // --> backup = x123
//        backup[0] = "A01"; // B01 --> A01
//        System.out.println("Processed Data = " + Arrays.asList(backup)); // ["A01", "B02"]

        // No Side Effect
        //case 1:
        String[] backup = new String[data.length];
        for(int i=0; i< data.length; i++) {
            backup[i] = data[i];
        }
        backup[0] = "A01"; // B01 --> A01
        System.out.println("Processed Data = " + Arrays.asList(backup)); // ["A01", "B02"]
    }
}
