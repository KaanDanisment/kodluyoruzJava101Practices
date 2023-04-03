package kodluyoruzJava101;

import java.util.Scanner;

public class FindingMinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums;

        do {
            System.out.print("How many numbers will you enter? :");
            nums = scan.nextInt();
            if (nums <= 0){
                System.out.println("Enter a positive number");
            }
        } while (nums <= 0);

        System.out.print("1. number: ");
        int n = scan.nextInt();
        int min = n;
        int max = n;

        for (int i = 2; i <= nums; i++) {
            System.out.print(i + ". number: ");
            n = scan.nextInt();

            if (n < min) {
                min = n;
            } else if (n > max) {
                max = n;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
