package kodluyoruzJava101;

public class PrimeNumberInRange1and100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            int n = 0;
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    n++;
                }
            }
            if (n < 2){
                System.out.print(i + " ");
            }
        }
    }
}