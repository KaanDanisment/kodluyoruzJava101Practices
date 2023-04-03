package kodluyoruzJava101;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers below:");
        int n1 = scan.nextInt(), n2 = scan.nextInt();
        int ebob = 0, i, k = 1, ekok = 0;

        if (n1 < n2){
            i = n1;
            while (i > 0){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }i--;
            }
            System.out.println("EBOB: " + ebob);
        }else {
            i = n2;
            while (i > 0){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }i--;
            }
            System.out.println("EBOB: " + ebob);
        }
        while (k <= n1 * n2){
            if (k % n1 == 0 && k % n2 == 0){
                ekok = k;
                break;
            }k++;
        }
        System.out.println("EKOK: " + ekok);
    }
}
