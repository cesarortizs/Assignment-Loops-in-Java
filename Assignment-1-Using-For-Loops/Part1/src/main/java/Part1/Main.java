package Part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print Numbers
        System.out.println("\nThe first ten numbers are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate Sum
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("\nThe sum of the first ten numbers is: " + sum);

        // Print Multiplication Table
        Scanner input = new Scanner(System.in);
        int selectedNumber = 0;

        System.out.print("\nEnter a number to calculate its multiplication table: ");
        selectedNumber = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(selectedNumber + " * " + i + " = " + (selectedNumber * i));
        }

    }
}