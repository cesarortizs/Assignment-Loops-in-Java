package Part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String selectedOption;
        int positiveNumber = 0;
        int digitSum = 0;

        do
        {
            // User Input
            do
            {
                System.out.print("\nEnter a positive number: ");
                positiveNumber = input.nextInt();
            } while (positiveNumber <= 0);

            // Sum the Digits
            while(positiveNumber > 0)
            {
                digitSum += positiveNumber % 10;
                positiveNumber /= 10;
            }

            // Output the Result
            System.out.println("\nThe sum of the digits of the number is: " + digitSum);

            // Optional Enhancements
            System.out.print("\nDo you wish to exit? (Y/N): ");
            input.nextLine();
            selectedOption = input.nextLine();
            digitSum = 0;
        } while(!selectedOption.equalsIgnoreCase("y"));
    }
}