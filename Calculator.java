/* CALCULATOR (CLI)  
 * 
 * PROBLEM STATEMENT:-
 * BASIC CALCULATOR THAT PERFORMS ADDITION, SUBTRACTION, MULTIPLICATION AND DIVISION OPERATIONS.
 * 
 * WHAT YOU'LL LEARN FROM THIS PROJECT:-
 * 1)TAKING INPUT USING SCANNER CLASS.
 * 2) USING if-else CONDITIONAL STATEMENTS.
 * 3) WRITING CLEAN FUNCTIONS
 * 4)HANDLING DIVISION BY ZERO EXCEPTION.
 * 
*/

/* CALCULATOR (CLI)  
 * BASIC CALCULATOR THAT PERFORMS ADDITION, SUBTRACTION, MULTIPLICATION AND DIVISION.
 */

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero");
            return Double.NaN;   //always return a double
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        String result;  // keep as String if you want to print as text

        if (operator == '+') {
            result = String.valueOf(add(num1, num2));
        } else if (operator == '-') {
            result = String.valueOf(sub(num1, num2));
        } else if (operator == '*') {
            result = String.valueOf(multi(num1, num2));
        } else if (operator == '/') {
            result = String.valueOf(divide(num1, num2));
        } else {
            System.out.println("Invalid operator! Please use +, -, * or /.");
            sc.close();
            return;  //stop execution if invalid operator
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
