package javaprograms;
//7. Write a Java program to test if an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class Program_7 {
    public static void main(String[] args) {
            // Creating ArrayList of Colours
            List<String> colours = new ArrayList<>();
            colours.add("White");
            colours.add("Black");
            colours.add("Red");
            colours.add("Yellow");
            colours.add("Magenta");

            // Creating Blank ArrayList
            List<Integer> numbers = new ArrayList<>();

            if (numbers.isEmpty()) { // Checking colours ArrayList and returning message
                System.out.println("Numbers ArrayList is Empty.");
            } else {
                System.out.println("Number ArrayList in not Empty.");
            }

            if (colours.isEmpty()) { // Checking numbers ArrayList and returning message
                System.out.println("Colours ArrayList is Empty.");
            } else {
                System.out.println("Colours ArrayList is not Empty.");
            }
        }




    }

