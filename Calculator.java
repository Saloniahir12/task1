import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double addition(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Calculating = true;

        System.out.println("===== Basic Calculator =====");

        while (Calculating) {
            // Input numbers and operator
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            // Perform calculation using methods
            switch (operator) {
                case '+':
                    result = addition(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            // Ask user if they want to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes") && !choice.equals("y")) {
                Calculating = false;
                System.out.println("Calculator exited.");
            }

            System.out.println("----------------------------");
        }

        sc.close();
    }
}