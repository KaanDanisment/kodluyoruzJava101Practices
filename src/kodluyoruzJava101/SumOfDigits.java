package kodluyoruzJava101;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int valOfDig;
        int result = 0;

        while (number != 0){
            valOfDig = number % 10;
            result += valOfDig;
            number /= 10;
        }
        System.out.println(result);
    }
}
