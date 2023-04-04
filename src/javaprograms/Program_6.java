package javaprograms;

import java.util.ArrayList;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given
    array list
 */
public class Program_6 {
    public static void main(String[] args) {


// creating Array list of flowers
        ArrayList<String> flowers = new ArrayList();
        flowers.add("Rose");
        flowers.add("Lotus");
        flowers.add("Jasmine");
        flowers.add("Lily");
        flowers.add("Tulip");
        String element = flowers.get(2);
        System.out.println("Second element stored in Array is: " + element);
        element = flowers.get(4);
        System.out.println("Fourth element stored in Array is: " + element);



    }
}
