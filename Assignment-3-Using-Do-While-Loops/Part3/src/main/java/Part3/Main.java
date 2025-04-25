package Part3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int operation;

        // Read User Input
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nChoose one of the following operations:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            operation = input.nextInt();

            if (operation != 5)
            {
                System.out.print("\nEnter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                switch(operation)
                {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operation");
                }

                System.out.println("\nYour result is: " + result);
            }
        } while(operation != 5);
    }
}