package kodluyoruzJava101;

import java.util.Scanner;

public class BissextileCalculator {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a bissextile");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a bissextile");
        }else System.out.println(year + " is not a bissextile ");
    }
}
