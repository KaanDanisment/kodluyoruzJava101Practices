package kodluyoruzJava101;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        int n,r,nFactorial = 1, rFactorial = 1, nrFactorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the combination numbers below");
        n = scan.nextInt();
        r = scan.nextInt();

        for (int i = 1; i <= n; i++){
            nFactorial *= i;
        }for (int j = 1; j <= r; j++){
            rFactorial *= j;
        }for (int k = 1; k <= (n-r); k++){
            nrFactorial *= k;
        }
        System.out.println(nFactorial / (rFactorial*nrFactorial));
    }
}
