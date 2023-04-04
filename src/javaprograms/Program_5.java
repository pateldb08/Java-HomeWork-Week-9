package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
5. Write a Java program to iterate through all elements in an array list using
Iterater.
 */
public class Program_5 {


    public static void main(String[] args) {

        // Creating ArrayList of Colours
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Magenta");
        // Iterating and printing the array by Iterator
        Iterator<String> colourIterator = colours.iterator();
        while (colourIterator.hasNext()) {
            System.out.println(colourIterator.next());
        }
    }

}
