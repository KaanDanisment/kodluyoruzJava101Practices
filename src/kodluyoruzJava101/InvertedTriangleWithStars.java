package kodluyoruzJava101;

import java.util.Scanner;

public class InvertedTriangleWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int d = scan.nextInt();

        for (int i = d; i >= 1; i--) {
            for (int j = 1; j <= d-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
