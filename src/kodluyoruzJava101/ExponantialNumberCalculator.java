package kodluyoruzJava101;

import java.util.Scanner;

public class ExponantialNumberCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int x = scan.nextInt();
        System.out.print("Enter the Power: ");
        int y = scan.nextInt(), t = 1;

        for (int i = 1; i <= y; i++){
            t *= x;
        }
        System.out.println(t);
    }
}
