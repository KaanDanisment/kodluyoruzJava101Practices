package kodluyoruzJava101;

import java.util.Scanner;

public class PrimeNumberCalculationWithRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("If you want to finish, press 0");
            System.out.print("Enter a number: ");
            num = scan.nextInt();
            if (num == 1) {
                System.out.println(num + " is not Prime");
            } else if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println(primeNumber(num, num, 0));
            }
        } while (true);
    }

    static String primeNumber(int num, int num2, int count) {
        if (num % num2 == 0) {
            count++;
        }
        if (num2 == 1) {
            if (count > 2) {
                return num + " is not Prime";
            } else {
                return num + " is Prime";
            }
        }
        return primeNumber(num, num2 - 1, count);
    }
}
