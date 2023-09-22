package guviTask11;

import java.util.Scanner;

public class DivisionPro {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first integer from the user
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Read the second integer from the user
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Check if the second number is zero before performing division
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            // Perform the division
            double result = (double) num1 / num2;

            // Display the result
            System.out.println(num1 + " divided by " + num2 + " is " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to release resources
        }
    }







}
