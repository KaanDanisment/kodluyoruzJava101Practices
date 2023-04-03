package kodluyoruzJava101;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }for (int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }for (int i = (num-1); i > 0;i--){
            for (int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }for (int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}