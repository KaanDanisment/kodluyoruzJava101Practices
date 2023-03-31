package kodluyoruzJava101;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = scan.nextInt(), t = 0, c = 0;

        for (int i = 1; i <= k; ++i){
            if(i % 3 == 0 && i % 4 == 0){
                t += i;
                c ++;
            }
        }
        System.out.println("Average of number dividing by 3 and 4 without remainder: " + (t/c));
    }
}
