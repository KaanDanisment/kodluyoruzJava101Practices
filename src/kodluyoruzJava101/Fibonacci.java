package kodluyoruzJava101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Fibonacci series number: ");
        int fib = scan.nextInt(), n1 = 0, n2 = 1, n3;

        for (int i = 0; i <= fib; i++){
            System.out.print(n1 + " ");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}
