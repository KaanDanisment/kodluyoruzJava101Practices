package kodluyoruzJava101;

import java.util.Scanner;

public class SumOfEvenAndMultipleOf4Numbers {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        Scanner scan = new Scanner(System.in);

        while (i % 2 == 0) {
            System.out.println("Enter a number: ");
            i = scan.nextInt();
            if (i % 4 == 0) {
                sum += i;
            }
        }System.out.println("SumOfEvenAndMultipleOf4Numbers: " + sum);
    }
}
