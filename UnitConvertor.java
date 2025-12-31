/* UNIT CONVERTER
 * 
 * PROBLEM STATEMENT:-
 * BUILD TO CONVERT THE UNIT BASED ON USER INPUT.
 
 * WHAT YOU'LL LEARN FROM THIS PROJECT:-
 * 1)CONSOLE OUTPUT FORMATTING
 * 2)SWITCH CASE  AND CONDITION
 * 3)HANDLING USER INPUT WITH SCANNER
 * 4)METHOD CREATION AND RETURN VALUES
 * 
*/
import java.util.Scanner;

class UnitConvertor {

    public static double kilosToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKilos(double miles) {
        return miles / 0.621371;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Unit Converter ----------");
        System.out.println("1. Kilometer to Mile");
        System.out.println("2. Mile to Kilometer");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1–4): ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.print("Enter the distance in kilometers: ");
                double km = sc.nextDouble();
                System.out.printf("%.2f km = %.2f miles%n", km, kilosToMiles(km));
                break;

            case 2:
                System.out.print("Enter the distance in miles: ");
                double miles = sc.nextDouble();
                System.out.printf("%.2f miles = %.2f km%n", miles, milesToKilos(miles));
                break;

            case 3:
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                System.out.printf("%.2f °C = %.2f °F%n", c, cToF(c));
                break;

            case 4:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.printf("%.2f °F = %.2f °C%n", f, fToC(f));
                break;

            default:
                System.out.println("Invalid choice. Goodbye!");
        }

        sc.close();
    }
}
