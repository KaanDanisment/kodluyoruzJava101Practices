package kodluyoruzJava101;

import java.util.Scanner;

public class PerfectNumberCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt(), r = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                r += i;
            }
        }
        if (r == num){
            System.out.println(num + " is a perfect number");
        }else {
            System.out.println(num + " is not perfect number");
        }
    }
}
