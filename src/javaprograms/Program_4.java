package javaprograms;

import java.util.ArrayList;

/*
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.

 */
public class Program_4 {
//    public static void main(String[] args) {
//        myMethod();
//    }
//
//    public static void myMethod() {
//
//        String arr[] = {"Blue", "Red", "Orange", "Green", "Yellow"};
//        List a = new ArrayList();
//        for (int i = 0; i < 5; i++) {
//            a.add(arr[i]);
//            System.out.println(a + " Colour of this array " + a.size());
//        }
//    }


    public static void main(String[] args) {
        // Creating ArrayList of Colours
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Magenta");
        // For each loop getting values and assigning to colour object and printing it
        for (Object colour : colours) {
            System.out.println(colour);
        }
    }
}
