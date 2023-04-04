package javaprograms;

import java.util.ArrayList;

/*
11. Declare following two arrylist and compare it.

ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Program_11 {

    public static void main(String[] args) {

        ArrayList<String> c1= new ArrayList<String>(); // First ArrayList declaration
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>(); // Second ArrayList declaration
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println(c1); // Printing ArrayList c1 for user
        System.out.println(c2); // Printing ArrayList c2 for user
       boolean compare = c1.equals(c2); // Comparing the two ArrayLList and returning boolean value
        System.out.println(compare);   //// Printing true or false depending on boolean value

        // OR,
        // System.out.println("Compare Two Array List: " + c1.contains(c2));
    }



}
