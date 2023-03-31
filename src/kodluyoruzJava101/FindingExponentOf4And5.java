package kodluyoruzJava101;

import java.util.Scanner;

public class FindingExponentOf4And5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt(), x = 1, y = 1;

        for (int i = 0; i < n; i++){
            while (i==0){
                System.out.println(i + "th power of 4: 1");
                System.out.println(i + "th power of 5: 1" );
                i++;
            }
            if (x <= n){
                x *= 4;
                System.out.println(i + "th power of 4: " + x);
            }
            if (y <= n){
                y *= 5;
                System.out.println(i + "th power of 5: " + y);
            }
        }
    }
}
