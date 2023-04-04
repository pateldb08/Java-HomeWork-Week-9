package Program_1_calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //// scanner declaration

        char input = 'Y';
        while (input == 'y' || input == 'Y') {
            System.out.println("Please enter First number: ");
            int a = scanner.nextInt();
            System.out.println("Please enter Second number: ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/: ");
            char symbol = scanner.next().charAt(0); // this is the indexing of the element to take.
            Calculator calculateResult = new Calculator(); // Calculator class object creation
            calculateResult.calculateResult(a, b, symbol); // calling this method from Caluculaor class
            System.out.println(" ");

            System.out.println("Would you like to do more calculation, Plaease enter 'Y' or 'N ' : ");
            input = scanner.next().charAt(0);
            if (input == 'n' || input == 'N'){
                break;
            }
        }

        scanner.close();


    }

}
