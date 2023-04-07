package kodluyoruzJava101;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit";
        System.out.println(menu);
        do {
            System.out.print("Select a operation: ");
            select = scan.nextInt();
            switch (select) {
                case (1):
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponential();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangularAreaAndPerimeterCalculation();
                    break;
                case 0:
                    select = 0;
                    break;
                default:
                    System.out.println("Wrong entry! Try Again.");

            }
        } while (select != 0);

    }

    static void addition() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Result: " + (a + b));

    }

    static void subtraction() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Result: " + (a - b));
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Result: " + (a * b));
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividing: ");
        double a = scan.nextInt();
        System.out.print("Enter the divisor: ");
        double b = scan.nextInt();
        System.out.println("Result: " + (a / b));
    }

    static void exponential() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int b = scan.nextInt();
        System.out.print("Enter the power: ");
        int p = scan.nextInt(), r = 1;
        for (int i = 1; i <= p; i++) {
            r *= b;
        }
        System.out.println("Result: " + r);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int f = scan.nextInt(), r = 1;
        for (int i = f; i >= 1; i--) {
            r *= i;
        }
        System.out.println("Result: " + r);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividing: ");
        int a = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int b = scan.nextInt();
        System.out.println("Result: " + a % b);
    }

    static void rectangularAreaAndPerimeterCalculation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the long edge: ");
        int edge = scan.nextInt();
        System.out.print("Enter the short edge: ");
        int h = scan.nextInt();
        System.out.println("Area of Rectangular: " + edge * h);
        System.out.println("Perimeter of Rectangular: " + 2 * (edge + h));
    }
}

