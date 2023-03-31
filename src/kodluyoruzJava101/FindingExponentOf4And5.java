package kodluyoruzJava101;

import java.util.Scanner;

public class FindingExponentOf4And5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt(), p = 0;

        for (int i = 1, j = 1; i <= n || j <= n; i*=4, j*=5){
            if (i < n){
                System.out.println(p + "th power of 4: " + i);
            }
            if (j < n){
                System.out.println(p + "th power of 5: " + j);
                p++;
            }
        }
    }
}
