package javaprograms;

import java.util.HashSet;

/*
8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
 */
public class program_8 {

    public static void main(String[] args) {

        // Creating a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Adding values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // for loop with if else showing which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was FOUND in the set.");
            } else {
                System.out.println(i + " was NOT FOUND in the set.");
            }
        }
    }



}
