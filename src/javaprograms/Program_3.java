package javaprograms;
/*
3. Write a Java program to reverse an array of integer values.
 */

public class Program_3 {
    public static void main(String[] args) {
       string1();
    }

    public static void string1() {

        //Initialize array
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

}
